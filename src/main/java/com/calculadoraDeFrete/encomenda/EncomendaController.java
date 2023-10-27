package com.calculadoraDeFrete.encomenda;

import com.calculadoraDeFrete.exceptions.NaoEncontradoException;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/encomendas")
@RequiredArgsConstructor
public class EncomendaController {

    private final ModelMapper modelMapper;
    private final EncomendaService service;

    @GetMapping("/all")
    public List<EncomendaResponse> listarTodos() {
        return this.service.listarTodos().stream()
                .map(this::convertResponse)
                .toList();
    }

    @GetMapping("/{uuid}")
    public EncomendaResponse getPorUuid(@PathVariable UUID uuid) {
        return this.service.getPorUuid(uuid)
                .map(this::convertResponse)
                .orElseThrow(() -> new NaoEncontradoException("Encomenda não encontrada"));
    }

    @GetMapping(params = {"descricao"})
    public List<EncomendaResponse> buscarPorDescricao(@RequestParam String descricao) {
        return this.service.buscarPorDescricao(descricao).stream()
                .map(this::convertResponse)
                .toList();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EncomendaResponse cadastrarEncomenda(@RequestBody EncomendaRequest request) {
        EncomendaResponse encomendaResponse = service.cadastrarEncomenda(request);
        return encomendaResponse;
    }

    @PutMapping("{uuid}")
    public EncomendaResponse substituir(@PathVariable UUID uuid, @RequestBody EncomendaRequest request) {
        EncomendaDTO updated = this.service.substituir(uuid, this.convertRequest(request));
        return this.convertResponse(updated);
    }

    @DeleteMapping("{uuid}")
    public void excluir(@PathVariable UUID uuid) {
        this.service.excluir(uuid);
    }

    private EncomendaResponse convertResponse(EncomendaDTO encomenda) {
        return this.modelMapper.map(encomenda, EncomendaResponse.class);
    }

    private EncomendaDTO convertRequest(EncomendaRequest request) {
        return this.modelMapper.map(request, EncomendaDTO.class);
    }
}
