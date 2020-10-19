package com.escola.atividade.http.data;

import com.escola.atividade.entidade.Atividade;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AtividadeRequest implements Serializable{
    @JsonProperty
    private String ra;
    @JsonProperty
    private String nome;
    @JsonProperty
    private String dataHora;
    @JsonProperty
    private String disciplina;
    @JsonProperty("atividade")
    private String codigoAtividade;
    @JsonProperty
    private Atividade conteudo;

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getCodigoAtividade() {
        return codigoAtividade;
    }

    public void setCodigoAtividade(String codigoAtividade) {
        this.codigoAtividade = codigoAtividade;
    }

    public Atividade getConteudo() {
        return conteudo;
    }

    public void setConteudo(Atividade conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "{" +
                "\"ra\":\"" + ra + '\"' +
                ", \"nome\":\"" + nome + '\"' +
                ", \"dataHora\":\"" + dataHora + '\"' +
                ", \"disciplina\":\"" + disciplina + '\"' +
                ", \"codigoAtividade\":\"" + codigoAtividade + '\"' +
                ", \"conteudo\":" + conteudo +
                '}';
    }
}
