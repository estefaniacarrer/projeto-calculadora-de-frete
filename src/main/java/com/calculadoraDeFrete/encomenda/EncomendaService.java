package com.calculadoraDeFrete.encomenda;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.calculadoraDeFrete.encomenda.EncomendaDTO;
import com.calculadoraDeFrete.encomenda.Encomenda;
import com.calculadoraDeFrete.encomenda.EncomendaRepository;
import com.calculadoraDeFrete.encomenda.frete.CalculadorFreteService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EncomendaService {

    private final EncomendaRepository repository;
    private final ModelMapper modelMapper;
    private final CalculadorFreteService calculadorFreteService;

    public List<EncomendaDTO> listarTodos() {
        return this.repository.findAll().stream()
                .map(this::convertDto)
                .toList();
    }

    private EncomendaDTO convertDto(Encomenda encomenda) {
        return this.modelMapper.map(encomenda, EncomendaDTO.class);
    }

    private Encomenda convertFromDto(EncomendaDTO encomenda) {
        return this.modelMapper.map(encomenda, Encomenda.class);
    }

    public Optional<EncomendaDTO> getPorUuid(UUID uuid) {
        return this.repository.findByUuid(uuid).map(this::convertDto);
    }

    public List<EncomendaDTO> buscarPorDescricao(String descricao) {
        return this.repository.findByDescricaoContainingIgnoreCase(descricao).stream()
                .map(this::convertDto)
                .toList();
    }

    public EncomendaResponse cadastrarEncomenda(EncomendaRequest request) {
        EncomendaDTO encomendaDTO = modelMapper.map(request, EncomendaDTO.class);
        Encomenda encomenda = modelMapper.map(encomendaDTO, Encomenda.class);

        UUID uuid = UUID.randomUUID();
        encomenda.setUuid(uuid);

        double valorFrete = calculadorFreteService.calcularFrete(encomendaDTO);
        encomenda.setValorFrete(valorFrete);

        Encomenda savedEncomenda = repository.save(encomenda);
        return modelMapper.map(savedEncomenda, EncomendaResponse.class);
    }

    public EncomendaDTO substituir(UUID uuid, EncomendaDTO request) {
        Encomenda encomenda = this.repository.findByUuid(uuid).orElseThrow();
        encomenda.setNomeRemetente(request.getNomeRemetente());
        encomenda.setNomeDestinatario(request.getNomeDestinatario());
        encomenda.setDescricao(request.getDescricao());
        encomenda.setTipoPacote(request.getTipoPacote());
        Encomenda updated = this.repository.save(encomenda);
        return this.convertDto(updated);
    }

    public void excluir(UUID uuid) {
        Encomenda encomenda = this.repository.findByUuid(uuid).orElseThrow();
        this.repository.delete(encomenda);
    }
}