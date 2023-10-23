package com.calculadoraDeFrete.service;

import com.calculadoraDeFrete.dto.EncomendaDTO;
import com.calculadoraDeFrete.model.Encomenda;
import com.calculadoraDeFrete.repository.EncomendaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EncomendaComFreteService {

    private final EncomendaRepository encomendaRepository;
    private final CalculadorFreteService calculadorFreteService;

    public Encomenda criarEncomendaComFrete(EncomendaDTO encomendaDTO) {
        UUID uuid = UUID.randomUUID();
        encomendaDTO.setUuid(uuid);

        Encomenda encomenda = new Encomenda(encomendaDTO);

        double valorFrete = calculadorFreteService.calcularFrete(encomendaDTO);
        encomenda.setValorFrete(valorFrete);

        return encomendaRepository.save(encomenda);
    }
}
