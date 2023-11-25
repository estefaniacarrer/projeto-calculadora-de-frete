package com.calculadoraDeFrete.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Optional;
import java.util.UUID;

import com.calculadoraDeFrete.encomenda.*;
import com.calculadoraDeFrete.exceptions.NaoEncontradoException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class EncomendaServiceTest {

    @InjectMocks
    private EncomendaService encomendaService;

    @Mock
    private EncomendaRepository repository;

    @Test
    void testTentativaSubstituirEncomendaInexistente() {
        UUID uuidInexistente = UUID.randomUUID();

        EncomendaDTO request = new EncomendaDTO();
        request.setNomeRemetente("Novo Remetente");
        request.setNomeDestinatario("Novo Destinatário");
        request.setDescricao("Nova Descrição");
        request.setTipoPacote(TipoPacote.GRANDE);

        when(repository.findByUuid(uuidInexistente)).thenReturn(Optional.empty());

        assertThrows(NaoEncontradoException.class, () -> encomendaService.substituir(uuidInexistente, request));

    }

    @Test
    void testExcluirEncomendaExistente() {
        UUID uuid = UUID.randomUUID();
        Encomenda encomendaExistente = new Encomenda();
        encomendaExistente.setUuid(uuid);

        when(repository.findByUuid(uuid)).thenReturn(Optional.of(encomendaExistente));
        encomendaService.excluir(uuid);

        verify(repository, times(1)).delete(encomendaExistente);
    }

    @Test
    void testTentativaExcluirEncomendaInexistente() {
        UUID uuidInexistente = UUID.randomUUID();

        when(repository.findByUuid(uuidInexistente)).thenReturn(Optional.empty());

        assertThrows(NaoEncontradoException.class, () -> encomendaService.excluir(uuidInexistente));
    }
}
