package com.calculadoraDeFrete.user;


import java.util.List;
import java.util.Optional;

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

    private UserDto convertDto(User users) {
        return this.modelMapper.map(users, UserDto.class);
    }

    private User convertFromDto(UserDto userDto) {
        return this.modelMapper.map(userDto, User.class);
    }

    public Optional<UserDto> getByUserName(String userName) {
        return this.repository.findByUserName(userName);
    }

    public UserDto register(UserDto usuarioDto) {
        User users = this.convertFromDto(usuarioDto);
        final var save = this.repository.save(users);
        return this.convertDto(save);
    }
}
