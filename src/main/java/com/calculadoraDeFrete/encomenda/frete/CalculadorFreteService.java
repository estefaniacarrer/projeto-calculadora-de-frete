package com.calculadoraDeFrete.encomenda.frete;

import com.calculadoraDeFrete.encomenda.EncomendaDTO;
import com.calculadoraDeFrete.encomenda.Endereco;
import com.calculadoraDeFrete.encomenda.TipoPacote;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CalculadorFreteService {

    private final CalculadorDistanciaService calculadorDistanciaService;
    private static final double VALOR_POR_QUILOMETRO = 0.10;

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
            double valorFreteBase = distancia * VALOR_POR_QUILOMETRO;
            double custoTotal = valorFreteBase + (distancia * valorBase);

            custoTotal = Math.round(custoTotal * 100.0) / 100.0;
            return custoTotal;
        } else {
            return -1.0;
        }
    }
}






