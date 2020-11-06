package com.escola.disciplina.entidade;

import java.util.HashMap;
import java.util.List;

public class DisciplinasAtividadesAnalitico {
    public static HashMap<String, HashMap<String, MediaSimplesAtividades>> extractFrom(List<Avaliacao> avaliacaos) {
        HashMap<String, HashMap<String, MediaSimplesAtividades>> disciplinasAtividades = new HashMap<>();

        for (Avaliacao avaliacao : avaliacaos) {
            if (!disciplinasAtividades.containsKey(avaliacao.getDisciplina())) {
                disciplinasAtividades.put(avaliacao.getDisciplina(), new HashMap<String, MediaSimplesAtividades>());
            }

            HashMap<String, MediaSimplesAtividades> atividades = disciplinasAtividades.get(avaliacao.getDisciplina());
            if (!atividades.containsKey(avaliacao.getCodigoAtividade())) {
                MediaSimplesAtividades mediaSimplesAtividades = new MediaSimplesAtividades(avaliacao.getNota());
                atividades.put(avaliacao.getCodigoAtividade(), mediaSimplesAtividades);
            } else {
                MediaSimplesAtividades mediaSimplesAtividades = atividades.get(avaliacao.getCodigoAtividade());
                mediaSimplesAtividades.adicionarNota(avaliacao.getNota());
            }
        }

        return disciplinasAtividades;
    }
}
