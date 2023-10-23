package com.calculadoraDeFrete.dto;

import com.calculadoraDeFrete.model.Endereco;
import com.calculadoraDeFrete.model.TipoPacote;
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
