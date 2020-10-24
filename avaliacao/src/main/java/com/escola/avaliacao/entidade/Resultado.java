package com.escola.avaliacao.entidade;

public class Resultado {
    private String ra;
    private String nome;
    private String disciplina;
    private String codigoAtividade;
    private Double nota;

    public Resultado(String ra, String nome, String disciplina, String codigoAtividade, Double nota) {
        this.ra = ra;
        this.nome = nome;
        this.disciplina = disciplina;
        this.codigoAtividade = codigoAtividade;
        this.nota = nota;
    }

    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public String getCodigoAtividade() {
        return codigoAtividade;
    }

    public Double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return  "{" +
                "\"ra\":\"" + ra + '\"' +
                ",\"nome\":\"" + nome + '\"' +
                ",\"disciplina\":\"" + disciplina + '\"' +
                ",\"codigoAtividade\":\"" + codigoAtividade + '\"' +
                ",\"nota\":\"" + nota +"\"}";
    }
}
