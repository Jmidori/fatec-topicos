package com.escola.avaliacao.servico;

import com.escola.avaliacao.entidade.Atividade;
import com.escola.avaliacao.entidade.Resultado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class AtividadeConsumer {
    @Autowired
    private JmsTemplate template;

    @JmsListener(destination = "${jms.queue}", containerFactory = "jmsFactory")
    public void getAtividadeEnfileirada(Atividade atividade) {
        System.out.println("-- Atividade recebida: "+ atividade.toString());

        Resultado resultado = this.getResultado(atividade);
        System.out.println("-- Resultado enviado ao topico: " + resultado);





            //envia para o topico o resultado
            //salva no db
            return;

        //log erro

    }

    private Resultado getResultado(Atividade atividade) {
        Random random = new Random();

        return new Resultado(atividade.getNome(),
                    atividade.getRa(),
                    atividade.getDisciplina(),
                    atividade.getAtividade(),
                    Double.parseDouble(String.format("%.2f",random.nextDouble()*10)));
    }
}
