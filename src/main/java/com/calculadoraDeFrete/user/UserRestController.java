
package com.calculadoraDeFrete.user;

        import jakarta.validation.Valid;
        import java.util.List;
        import lombok.RequiredArgsConstructor;
        import org.modelmapper.ModelMapper;
        import org.springframework.http.HttpStatus;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.ResponseStatus;
        import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UserRestController {

    private final UserService service;
    private final ModelMapper modelMapper;

    @GetMapping
    public List<UserResponse> listAll() {
        return this.service.listAll().stream()
                .map(this::convertResponse)
                .toList();
    }

    private UserResponse convertResponse(UserDto users) {
        return this.modelMapper.map(users, UserResponse.class);
    }

    @GetMapping("/{userName}")
    public UserResponse getByUserName(@PathVariable String userName) {
        UserDto userDto = this.service.getByUserName(userName);
        return convertResponse(userDto);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse register(@RequestBody @Valid UserRequest users) {
        UserDto userDto = this.convertRequest(users);
        UserDto userSalvo = this.service.register(userDto);
        return this.convertResponse(userSalvo);
    }

    private UserDto convertRequest(UserRequest users) {
        return this.modelMapper.map(users, UserDto.class);
    }

}
