
package com.calculadoraDeFrete.user;

        import jakarta.validation.Valid;
        import java.util.List;
        import lombok.RequiredArgsConstructor;
        import org.modelmapper.ModelMapper;
        import org.springframework.http.HttpStatus;
        import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioRestController {

    private final UsuarioService service;
    private final ModelMapper modelMapper;

    @GetMapping
    public List<UsuarioResponse> listarTodos() {
        return this.service.listarTodos().stream()
                .map(this::convertResponse)
                .toList();
    }

    private UsuarioResponse convertResponse(UsuarioDto usuario) {
        return this.modelMapper.map(usuario, UsuarioResponse.class);
    }

    @GetMapping("/{username}")
    public UsuarioResponse getByUserName(@PathVariable String username) {
        UsuarioDto usuarioDto = this.service.getByUsername(username);
        return convertResponse(usuarioDto);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioResponse cadastrar(@RequestBody @Valid UsuarioRequest usuario) {
        UsuarioDto usuarioDto = this.convertRequest(usuario);
        UsuarioDto usuarioSalvo = this.service.cadastrar(usuarioDto);
        return this.convertResponse(usuarioSalvo);
    }

    private UsuarioDto convertRequest(UsuarioRequest usuario) {
        return this.modelMapper.map(usuario, UsuarioDto.class);
    }

    @DeleteMapping("/{username}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void desativar(@PathVariable String username) {
        this.service.desativar(username);
    }

}
