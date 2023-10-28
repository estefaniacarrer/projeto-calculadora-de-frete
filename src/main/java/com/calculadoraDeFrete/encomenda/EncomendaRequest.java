package com.calculadoraDeFrete.encomenda;

import lombok.*;

@Getter
@Setter
@ToString
public class EncomendaRequest {

    private String nomeRemetente;
    private String nomeDestinatario;
    private String descricao;
    private TipoPacote tipoPacote;
    private Endereco enderecoOrigem;
    private Endereco enderecoDestino;

}
