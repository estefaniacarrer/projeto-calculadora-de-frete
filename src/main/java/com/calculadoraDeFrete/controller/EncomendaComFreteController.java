package com.calculadoraDeFrete.controller;

import com.calculadoraDeFrete.dto.EncomendaRequest;
import com.calculadoraDeFrete.dto.EncomendaResponse;
import com.calculadoraDeFrete.service.EncomendaComFreteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/encomendas")
@RequiredArgsConstructor
public class EncomendaComFreteController {

    private final EncomendaComFreteService encomendaService;

    @PostMapping("/cadastrar")
    @ResponseStatus(HttpStatus.CREATED)
    public EncomendaResponse cadastrarEncomenda(@RequestBody EncomendaRequest request) {
        EncomendaResponse encomendaResponse = encomendaService.cadastrarEncomenda(request);
        return encomendaResponse;
    }
}
