package com.calculadoraDeFrete.controller;

import com.calculadoraDeFrete.dto.EncomendaDTO;
import com.calculadoraDeFrete.model.Encomenda;
import com.calculadoraDeFrete.service.EncomendaComFreteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/encomendas")
@RequiredArgsConstructor
public class EncomendaComFreteController {

    private final EncomendaComFreteService encomendaService;

    @PostMapping("/criar")
    public Encomenda criarEncomenda(@RequestBody EncomendaDTO encomendaDTO) {
        return encomendaService.criarEncomendaComFrete(encomendaDTO);
    }
}
