package com.calculadoraDeFrete.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserRequest {

    @Email
    private String userEmail;
    @Pattern(regexp = "[\\w.]{5,20}", message = "Username deve ser alfanumérico entre 5 e 20 caracteres (lowercase, uppercase, numbers, _, .)")
    private String userName;
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$",
            message = "A senha deve conter de 8 a 20 caracteres (minúscula, maiúscula, números, caracteres especiais, não sequencial)")
    private String userPassword;



}
