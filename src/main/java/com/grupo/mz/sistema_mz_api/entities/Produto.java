package com.grupo.mz.sistema_mz_api.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Entity
@Getter
@Setter
public class Produto {

    private Long idProduto;
    private String descricao;
    private int qtdProduto;
    private int ean;
    private float precoCusto;
    private float precoVenda;
    private LocalDate validade;
    
}
