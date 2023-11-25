package com.calculadoraDeFrete.service;

import com.calculadoraDeFrete.encomenda.Endereco;
import com.calculadoraDeFrete.encomenda.EncomendaDTO;
import com.calculadoraDeFrete.encomenda.TipoPacote;
import com.calculadoraDeFrete.encomenda.frete.CalculadorDistanciaService;
import com.calculadoraDeFrete.encomenda.frete.CalculadorFreteService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CalculadorFreteServiceTest {

    @InjectMocks
    private CalculadorFreteService calculadorFreteService;

    @Mock
    private CalculadorDistanciaService calculadorDistanciaService;

    @Test
    void testCalcularFreteComDistanciaPositiva() {

        EncomendaDTO encomendaDTO = new EncomendaDTO();
        encomendaDTO.setEnderecoOrigem(new Endereco("Rua Origem", "123", "Cidade Origem", "Estado Origem", "12345-678"));
        encomendaDTO.setEnderecoDestino(new Endereco("Rua Destino", "456", "Cidade Destino", "Estado Destino", "87654-321"));
        encomendaDTO.setTipoPacote(TipoPacote.MEDIO);

        when(calculadorDistanciaService.calcularDistancia(any())).thenReturn(100.0);

        double resultado = calculadorFreteService.calcularFrete(encomendaDTO);

        assertEquals(20.0, resultado, 0.01);
    }

    @Test
    void testCalcularFreteComDistanciaZero() {
        // Dado
        EncomendaDTO encomendaDTO = new EncomendaDTO();
        encomendaDTO.setEnderecoOrigem(new Endereco("Rua Origem", "123", "Cidade Origem", "Estado Origem", "12345-678"));
        encomendaDTO.setEnderecoDestino(new Endereco("Rua Destino", "456", "Cidade Destino", "Estado Destino", "87654-321"));
        encomendaDTO.setTipoPacote(TipoPacote.MEDIO);

        when(calculadorDistanciaService.calcularDistancia(any())).thenReturn(0.0);

        double resultado = calculadorFreteService.calcularFrete(encomendaDTO);

        assertEquals(-1.0, resultado, 0.01);
    }

    @Test
    void testCalcularFreteComDistanciaNegativa() {

        EncomendaDTO encomendaDTO = new EncomendaDTO();
        encomendaDTO.setEnderecoOrigem(new Endereco("Rua Origem", "123", "Cidade Origem", "Estado Origem", "12345-678"));
        encomendaDTO.setEnderecoDestino(new Endereco("Rua Destino", "456", "Cidade Destino", "Estado Destino", "87654-321"));
        encomendaDTO.setTipoPacote(TipoPacote.MEDIO);

        when(calculadorDistanciaService.calcularDistancia(any())).thenReturn(-1.0);

        double resultado = calculadorFreteService.calcularFrete(encomendaDTO);

        assertEquals(-1.0, resultado, 0.01);
    }
}