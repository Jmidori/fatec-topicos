package com.escola.avaliacao.entidade;

public class Atividade {
    private String ra;
    private String nome;
    private String dataHora;
    private String disciplina;
    private String atividade;
    private Conteudo conteudo;

    public Atividade() {}

    public Atividade(String ra, String nome, String dataHora, String disciplina, String atividade, Conteudo conteudo) {
        this.ra = ra;
        this.nome = nome;
        this.dataHora = dataHora;
        this.disciplina = disciplina;
        this.atividade = atividade;
        this.conteudo = conteudo;
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

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public Conteudo getConteudo() {
        return conteudo;
    }

    public void setConteudo(Conteudo conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "Atividade{" +
                "ra='" + ra + '\'' +
                ", nome='" + nome + '\'' +
                ", dataHora='" + dataHora + '\'' +
                ", disciplina='" + disciplina + '\'' +
                ", atividade='" + atividade + '\'' +
                ", conteudo=" + conteudo +
                '}';
    }
}
