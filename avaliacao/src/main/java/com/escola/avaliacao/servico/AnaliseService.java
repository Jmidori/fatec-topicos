package com.escola.avaliacao.servico;

import com.escola.avaliacao.entidade.Atividade;
import com.escola.avaliacao.entidade.Resultado;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.Random;

@Component
public class AnaliseService {
    public boolean validaAtividade(Atividade atividade){
        //todo: implementado qqr coisa apenas para avancar na esteira
        if(Objects.nonNull(atividade)){
            return true;
        }
        return false;
    }

    public Resultado getResultado(Atividade atividade){
        Random random = new Random();

        return new Resultado(atividade.getNome(),
                atividade.getRa(),
                atividade.getDisciplina(),
                atividade.getAtividade(),
                Double.parseDouble(String.format("%.2f",random.nextDouble()*10)));
    }
}
