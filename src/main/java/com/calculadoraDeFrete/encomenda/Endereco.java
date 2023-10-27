package com.calculadoraDeFrete.encomenda;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Embeddable
public class Endereco {

    private String logradouro;
    private String numero;
    private String cidade;
    private String estado;
    private String codigoPostal;

}
