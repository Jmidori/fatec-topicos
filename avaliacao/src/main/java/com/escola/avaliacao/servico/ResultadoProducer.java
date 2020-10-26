package com.escola.avaliacao.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class ResultadoProducer {
    @Autowired
    private JmsTemplate jmsTemplateTopic;

    @Value("${destination.resultado-atividade-topic}")
    String topic;

    public void enfileiraTopico(String resultado){
        jmsTemplateTopic.convertAndSend(topic,resultado);
        System.out.println("->Enviando Resultado: " + resultado.toString());
    }
}
