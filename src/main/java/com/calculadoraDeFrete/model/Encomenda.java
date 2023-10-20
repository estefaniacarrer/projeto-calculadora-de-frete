package com.calculadoraDeFrete.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Encomenda {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private UUID uuid;
    private String nomeRemetente;
    private String nomeDestinatario;
    @Enumerated(EnumType.STRING)
    private TipoPacote tipoPacote;
}
