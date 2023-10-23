package com.calculadoraDeFrete.user;


import java.util.List;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final ModelMapper modelMapper;


    public List<UserDto> listAll() {
        return this.repository.findAll().stream()
                .map(this::convertDto)
                .toList();
    }

    private UserDto convertDto(User user) {
        return this.modelMapper.map(user, UserDto.class);
    }

    private User convertFromDto(UserDto userDto) {
        return this.modelMapper.map(userDto, User.class);
    }

    public UserDto getByUserName(String userName) {
        return this.repository.findByUserName(userName);
    }

    public UserDto register(UserDto usuarioDto) {
        User user = this.convertFromDto(usuarioDto);
        final var save = this.repository.save(user);
        return this.convertDto(save);
    }
}
