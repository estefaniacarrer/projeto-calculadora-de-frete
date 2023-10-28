package com.calculadoraDeFrete.encomenda;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EncomendaResponse {

    private UUID uuid;
    private String nomeRemetente;
    private String nomeDestinatario;
    private String descricao;
    private TipoPacote tipoPacote;
    private Endereco enderecoOrigem;
    private Endereco enderecoDestino;
    private double valorFrete;

}
