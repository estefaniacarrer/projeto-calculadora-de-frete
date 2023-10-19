package com.calculadoraDeFrete.service;

import com.calculadoraDeFrete.dto.DistanciaDTO;
import com.calculadoraDeFrete.model.Endereco;
import com.google.maps.DistanceMatrixApi;
import com.google.maps.GeoApiContext;
import com.google.maps.model.DistanceMatrix;
import com.google.maps.model.DistanceMatrixElement;
import com.google.maps.model.DistanceMatrixElementStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class CalculadorDistanciaService {

    @Autowired
    private Environment env;

    public double calcularDistancia(DistanciaDTO distanciaDTO) {
        String apiKey = env.getProperty("google.maps.api.key");
        GeoApiContext context = new GeoApiContext.Builder().apiKey(apiKey).build();
        try {
            Endereco enderecoOrigem = distanciaDTO.getEnderecoOrigem();
            Endereco enderecoDestino = distanciaDTO.getEnderecoDestino();

            String enderecoOrigemCompleto = enderecoOrigem.getLogradouro() + ", " + enderecoOrigem.getNumero() + ", " +
                    enderecoOrigem.getCidade() + ", " + enderecoOrigem.getEstado() + ", " + enderecoOrigem.getCodigoPostal();

            String enderecoDestinoCompleto = enderecoDestino.getLogradouro() + ", " + enderecoDestino.getNumero() + ", " +
                    enderecoDestino.getCidade() + ", " + enderecoDestino.getEstado() + ", " + enderecoDestino.getCodigoPostal();

            DistanceMatrix trix = DistanceMatrixApi.newRequest(context)
                    .origins(enderecoOrigemCompleto)
                    .destinations(enderecoDestinoCompleto)
                    .await();

            if (trix.rows.length > 0) {
                DistanceMatrixElement element = trix.rows[0].elements[0];
                if (element.status == DistanceMatrixElementStatus.OK) {
                    double distanciaEmMetros = element.distance.inMeters;
                    return distanciaEmMetros / 1000;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}






