package com.escola.avaliacao.servico;

import com.escola.avaliacao.entidade.Atividade;
import com.escola.avaliacao.entidade.Resultado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class AtividadeConsumer {
    @Autowired
    ResultadoProducer producer;

    @JmsListener(destination = "${jms.queue}", containerFactory = "consumerFactory")
    public void recebeMessagem(Atividade atividade){
        System.out.println("-- Atividade: " + atividade.toString());

//        producer.enfileiraTopico(this.getResultado(atividade));
        Resultado resultado = this.getResultado(atividade);
        producer.enfileiraTopico(resultado);
        System.out.println("-- Resultado: " + resultado);
    }

    public Resultado getResultado(Atividade atividade) {
        Random random = new Random();

        return new Resultado(atividade.getNome(),
                    atividade.getRa(),
                    atividade.getDisciplina(),
                    atividade.getAtividade(),
                    Double.parseDouble(String.format("%.2f",random.nextDouble()*10)));
    }
}
