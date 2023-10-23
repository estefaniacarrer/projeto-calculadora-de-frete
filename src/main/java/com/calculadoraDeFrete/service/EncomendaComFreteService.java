package com.calculadoraDeFrete.service;

import com.calculadoraDeFrete.dto.EncomendaDTO;
import com.calculadoraDeFrete.dto.EncomendaRequest;
import com.calculadoraDeFrete.dto.EncomendaResponse;
import com.calculadoraDeFrete.model.Encomenda;
import com.calculadoraDeFrete.repository.EncomendaRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EncomendaComFreteService {

    private final EncomendaRepository encomendaRepository;
    private final CalculadorFreteService calculadorFreteService;
    private final ModelMapper modelMapper;

    public EncomendaResponse cadastrarEncomenda(EncomendaRequest request) {
        EncomendaDTO encomendaDTO = modelMapper.map(request, EncomendaDTO.class);
        Encomenda encomenda = modelMapper.map(encomendaDTO, Encomenda.class);

        UUID uuid = UUID.randomUUID();
        encomenda.setUuid(uuid);

        double valorFrete = calculadorFreteService.calcularFrete(encomendaDTO);
        encomenda.setValorFrete(valorFrete);

        Encomenda savedEncomenda = encomendaRepository.save(encomenda);
        return modelMapper.map(savedEncomenda, EncomendaResponse.class);
    }
}
