package com.laboratorio.laboratorio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Laboratorio {
    @Id
    private Long id;
    private String sigla;
    private String nome;
    private String descricao;
    private String equipamentos;
    private String localizacao;
    private int capacidade;
    private boolean ativo;
}
