package com.escola.atividade.http.data;

import com.escola.atividade.entidade.Atividade;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;

public class AtividadeRequest {
    private String ra;
    private String nome;
    private LocalDateTime dataHora;
    @JsonProperty("atividade")
    private String codigoAtividade;
    private Atividade conteudo;

    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getCodigoAtividade() {
        return codigoAtividade;
    }

    public Atividade getConteudo() {
        return conteudo;
    }

    @Override
    public String toString() {
        return "{" +
                "ra='" + ra + '\'' +
                ", nome='" + nome + '\'' +
                ", dataHora=" + dataHora +
                ", atividade='" + codigoAtividade + '\'' +
                ", conteudo=" + conteudo +
                '}';
    }
}
