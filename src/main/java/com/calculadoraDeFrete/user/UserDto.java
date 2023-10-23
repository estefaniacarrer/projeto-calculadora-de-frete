package com.calculadoraDeFrete.user;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto {

    private String email;
    private String username;
    private String password;

    public UserDto(String username) {
        this.username = username;
    }
}

