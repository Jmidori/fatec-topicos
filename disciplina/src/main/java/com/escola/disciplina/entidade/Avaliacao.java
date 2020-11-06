package com.escola.disciplina.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Avaliacao {
    @Id
    @GeneratedValue
    private Long id;
    private String ra;
    private String nome;
    private String disciplina;
    private String codigoAtividade;
    private String nota;

    public Avaliacao() {
    }

    public Avaliacao(String ra, String nome, String disciplina, String codigoAtividade, String nota) {
        this.ra = ra;
        this.nome = nome;
        this.disciplina = disciplina;
        this.codigoAtividade = codigoAtividade;
        this.nota = nota;
    }

    public Long getId() {
        return id;
    }

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

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "{" +
                "\"ra\":\"" + ra + '\"' +
                ",\"nome\":\"" + nome + '\"' +
                ",\"disciplina\":\"" + disciplina + '\"' +
                ",\"codigoAtividade\":\"" + codigoAtividade + '\"' +
                ",\"nota\":\"" + nota + "\"}";
    }
}

