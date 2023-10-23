package com.calculadoraDeFrete.model;

import com.calculadoraDeFrete.dto.EncomendaDTO;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private UUID uuid;
    private String nomeRemetente;
    private String nomeDestinatario;
    private String descricao;
    @Enumerated(EnumType.STRING)
    private TipoPacote tipoPacote;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "logradouro", column = @Column(name = "origem_logradouro")),
            @AttributeOverride(name = "numero", column = @Column(name = "origem_numero")),
            @AttributeOverride(name = "cidade", column = @Column(name = "origem_cidade")),
            @AttributeOverride(name = "estado", column = @Column(name = "origem_estado")),
            @AttributeOverride(name = "codigoPostal", column = @Column(name = "origem_codigo_postal"))
    })
    private Endereco enderecoOrigem;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "logradouro", column = @Column(name = "destino_logradouro")),
            @AttributeOverride(name = "numero", column = @Column(name = "destino_numero")),
            @AttributeOverride(name = "cidade", column = @Column(name = "destino_cidade")),
            @AttributeOverride(name = "estado", column = @Column(name = "destino_estado")),
            @AttributeOverride(name = "codigoPostal", column = @Column(name = "destino_codigo_postal"))
    })
    private Endereco enderecoDestino;
    private double valorFrete;

}
