package com.escola.atividade.http.data;

import com.escola.atividade.entidade.Atividade;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AtividadeRequest {
    private String ra;
    private String nome;
    private LocalDateTime dataHora;
    @JsonProperty("atividade")
    private String codigoAtividade;
    private Atividade conteudo;
    }
