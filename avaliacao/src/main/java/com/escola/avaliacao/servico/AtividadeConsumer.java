package com.escola.avaliacao.servico;

import com.escola.avaliacao.entidade.Atividade;
import com.escola.avaliacao.entidade.Resultado;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import java.util.Random;

@Component
public class AtividadeConsumer {
    @Autowired
    ResultadoProducer producer;

    @JmsListener(destination = "${destination.atividade-avaliativa-queue}")
    public void recebeMessagem(String msg) throws JMSException, JsonProcessingException {
        System.out.println("<- Recebendo a atividade: " + msg);

        ObjectMapper mapper = new ObjectMapper();
        Atividade atividade = mapper.readValue(msg, Atividade.class);
        Resultado resultado = this.getResultado(atividade);
        producer.enfileiraTopico(resultado.toString());
    }

    public Resultado getResultado(Atividade atividade) {
        Random random = new Random();

        Resultado resultado =  new Resultado(atividade.getRa(),
                    atividade.getNome(),
                    atividade.getDisciplina(),
                    atividade.getCodigoAtividade(),
                    String.format("%.2f", 0 + (10 - 0) * random.nextDouble()));

        return resultado;
    }
}
