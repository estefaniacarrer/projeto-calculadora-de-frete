package com.calculadoraDeFrete.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Endereco {

    @Id
    @GeneratedValue
    private Long id;
    private String logradouro;
    private String numero;
    private String cidade;
    private String estado;
    private String codigoPostal;

}
