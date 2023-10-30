package com.calculadoraDeFrete.encomenda;

import com.calculadoraDeFrete.user.UsuarioDto;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EncomendaDTO {

    private UUID uuid;
    private String nomeRemetente;
    private String nomeDestinatario;
    private String descricao;
    private TipoPacote tipoPacote;
    private Endereco enderecoOrigem;
    private Endereco enderecoDestino;
    private double valorFrete;
    private UsuarioDto usuario;
}