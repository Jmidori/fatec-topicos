package com.escola.disciplina.entidade;

public class MediaSimplesAtividades {
    private Integer quantidadeAtividadesEntregues = 0;
    private Double acumuladorNotas = Double.valueOf(0);

    public MediaSimplesAtividades(String nota) {
        this.adicionarNota(nota);
    }

    public void adicionarNota(String nota) {
        this.quantidadeAtividadesEntregues++;
        this.acumuladorNotas += this.getNotaAsDouble(nota);
    }

    double getNotaAsDouble(String nota) {
        return Double.parseDouble(nota.replace(",", "."));
    }

    public Integer getQuantidadeAtividadesEntregues() {
        return quantidadeAtividadesEntregues;
    }

    public String getMediaSala() {
        Double mediaSimples = this.acumuladorNotas / this.getQuantidadeAtividadesEntregues();
        return String.format("%.2f", mediaSimples);
    }
}
