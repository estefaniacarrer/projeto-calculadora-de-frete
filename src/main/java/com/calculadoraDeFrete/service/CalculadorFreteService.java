package com.calculadoraDeFrete.service;

import com.calculadoraDeFrete.dto.DistanciaDTO;
import com.calculadoraDeFrete.dto.EncomendaDTO;
import com.calculadoraDeFrete.model.Endereco;
import com.calculadoraDeFrete.model.TipoPacote;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CalculadorFreteService {

    private final CalculadorDistanciaService calculadorDistanciaService;
    private static final double VALOR_POR_QUILOMETRO = 0.50;

    public double calcularFrete(EncomendaDTO encomendaDTO) {
        Endereco enderecoOrigem = encomendaDTO.getEnderecoOrigem();
        Endereco enderecoDestino = encomendaDTO.getEnderecoDestino();

        DistanciaDTO distanciaDTO = new DistanciaDTO();
        distanciaDTO.setEnderecoOrigem(enderecoOrigem);
        distanciaDTO.setEnderecoDestino(enderecoDestino);

        double distancia = calculadorDistanciaService.calcularDistancia(distanciaDTO);
        TipoPacote tipoPacote = encomendaDTO.getTipoPacote();
        double valorBase = tipoPacote.getValor();

        if (distancia > 0) {
            double valorFreteBase = distancia * VALOR_POR_QUILOMETRO; // Custo baseado na quilometragem
            return valorFreteBase + (distancia * valorBase); // Custo total considerando a quilometragem e o tipo de pacote
        } else {
            return -1; // Ou algum outro valor de erro adequado
        }
    }
}






