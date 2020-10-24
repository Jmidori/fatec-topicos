package com.escola.avaliacao.servico;

import com.escola.avaliacao.entidade.Resultado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class ResultadoProducer {
    @Autowired
    JmsTemplate jmsTemplate;

    @Value("${jms.topic}")
    String topic;

    public void enfileiraTopico(Resultado resultado){
        jmsTemplate.convertAndSend(topic,resultado);
    }
}
