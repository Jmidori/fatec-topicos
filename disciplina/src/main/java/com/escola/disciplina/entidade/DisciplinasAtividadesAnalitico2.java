package com.escola.disciplina.entidade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DisciplinasAtividadesAnalitico2 {
    private String disciplina;
    private String codigoAtividade;
    private int quantidadeAtividadesEntregues = 0;
    private Double acumuladorNotas = Double.valueOf(0);

    public DisciplinasAtividadesAnalitico2(String disciplina, String codigoAtividade, String nota) {
        this.disciplina = disciplina;
        this.codigoAtividade = codigoAtividade;

        this.adicionarNota(nota);
    }

    public void adicionarNota(String nota) {
        this.quantidadeAtividadesEntregues++;
        this.acumuladorNotas += this.getNotaAsDouble(nota);
    }

    double getNotaAsDouble(String nota) {
        return Double.parseDouble(nota.replace(",", "."));
    }

    public String getDisciplina() {
        return disciplina;
    }

    public String getCodigoAtividade() {
        return codigoAtividade;
    }

    public int getQuantidadeAtividadesEntregues() {
        return quantidadeAtividadesEntregues;
    }

    public String getMediaSala() {
        Double mediaSimples = this.acumuladorNotas / this.getQuantidadeAtividadesEntregues();
        return String.format("%.2f", mediaSimples);
    }

    public static List<DisciplinasAtividadesAnalitico2> extractFrom(List<Avaliacao> avaliacaos) {
        HashMap<String, DisciplinasAtividadesAnalitico2> disciplinasAtividadesAnalitico = new HashMap<>();
        List<DisciplinasAtividadesAnalitico2> disciplinasAtividadesAnaliticoRetorno = new ArrayList<>();

        for (Avaliacao avaliacao : avaliacaos) {
            String key = avaliacao.getDisciplina() + avaliacao.getCodigoAtividade();
            if (!disciplinasAtividadesAnalitico.containsKey(key)) {
                DisciplinasAtividadesAnalitico2 disciplinasAtividadesAnaliticoItem =
                        new DisciplinasAtividadesAnalitico2(avaliacao.getDisciplina(), avaliacao.getCodigoAtividade(), avaliacao.getNota());
                disciplinasAtividadesAnalitico.put(key, disciplinasAtividadesAnaliticoItem);
                disciplinasAtividadesAnaliticoRetorno.add(disciplinasAtividadesAnaliticoItem);
            } else {
                DisciplinasAtividadesAnalitico2 disciplinasAtividadesAnaliticoItem = disciplinasAtividadesAnalitico.get(key);
                disciplinasAtividadesAnaliticoItem.adicionarNota(avaliacao.getNota());
            }
        }

        return disciplinasAtividadesAnaliticoRetorno;
    }
}
