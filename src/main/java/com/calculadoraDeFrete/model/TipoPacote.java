package com.calculadoraDeFrete.model;

import lombok.Getter;

@Getter
public enum TipoPacote {

    PEQUENO("Até 500gr", 0.20),
    MEDIO("Acima de 500gr até 2kg", 0.40 ),
    GRANDE("Acima de 2g até 4kg", 0.60),
    EXTRAGRANDE("Acima de 4kg até 10kg", 0.80);

    private final String descricao;
    private final double valor;


    TipoPacote(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }


}
