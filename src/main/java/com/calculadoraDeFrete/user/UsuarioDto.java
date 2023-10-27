package com.calculadoraDeFrete.user;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UsuarioDto {

    private String email;
    private String username;
    private String password;

    public UsuarioDto(String username) {
        this.username = username;
    }
}


