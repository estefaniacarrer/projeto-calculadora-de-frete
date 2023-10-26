package com.calculadoraDeFrete.encomenda;

import lombok.Getter;

@Getter
public enum TipoPacote {

    PEQUENO("Até 500gr", 0.05),
    MEDIO("Acima de 500gr até 2kg", 0.10 ),
    GRANDE("Acima de 2g até 4kg", 0.15),
    EXTRAGRANDE("Acima de 4kg até 10kg", 0.25);

    private final String descricao;
    private final double valor;


    TipoPacote(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }


}
