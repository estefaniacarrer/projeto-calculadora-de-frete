package com.calculadoraDeFrete.user;

import lombok.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class user {
    private final UUID userId = UUID.randomUUID();
    private String userName;
    private String userEmail;
    private String userPassword;
    private LocalDateTime userRegisterDate;

    /*
    private String userStreet;
    private String userStreetNumber;
    private String userCEP;
    private String userCity;
     */
}
