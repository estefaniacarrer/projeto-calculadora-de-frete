package com.calculadoraDeFrete.dto;

import com.calculadoraDeFrete.model.Endereco;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DistanciaDTO {

    private Endereco enderecoOrigem;
    private Endereco enderecoDestino;
}
