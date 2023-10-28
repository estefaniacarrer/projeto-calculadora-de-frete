package com.calculadoraDeFrete.user;


import java.util.List;
import java.util.Optional;

import com.calculadoraDeFrete.exceptions.NaoEncontradoException;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository repository;
    private final ModelMapper modelMapper;

    public List<UsuarioDto> listarTodos() {
        return this.repository.findAll().stream()
                .map(this::convertDto)
                .toList();
    }

    private UsuarioDto convertDto(Usuario usuario) {
        return this.modelMapper.map(usuario, UsuarioDto.class);
    }

    private Usuario convertFromDto(UsuarioDto usuarioDto) {
        return this.modelMapper.map(usuarioDto, Usuario.class);
    }

    public UsuarioDto getByUsername(String username) {
        return this.repository.findByUsername(username)
                .map(this::convertDto)
                .orElseThrow(() -> new NaoEncontradoException("Usuário não encontrado"));
    }

    public Usuario getByUsernameEntity(String username) {
        return this.repository.findByUsername(username)
                .orElseThrow(() -> new NaoEncontradoException("Usuário não encontrado"));
    }

    public UsuarioDto cadastrar(UsuarioDto usuarioDto) {
        Usuario usuario = this.convertFromDto(usuarioDto);
        final var save = this.repository.save(usuario);
        return this.convertDto(save);
    }

    public void desativar(String username) {
        final var usuario = this.repository.findByUsername(username)
                .orElseThrow(() -> new NaoEncontradoException("Usuário não encontrado"));
        usuario.setActive(false);
        this.repository.save(usuario);
    }
}
