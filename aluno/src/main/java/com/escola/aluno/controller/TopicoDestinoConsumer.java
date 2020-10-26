package com.escola.aluno.controller;

import com.escola.aluno.entidade.Avaliacao;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.activemq.command.ActiveMQMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

@Component
public class TopicoDestinoConsumer {
    //private static Logger log = LoggerFactory.getLogger(TopicoDestinoConsumer.class);

    @JmsListener(destination = "ActiveMQ.Advisory.Producer.Queue.\"resultado-atividade\"")
    public void consumir(String msg) throws JMSException, JsonProcessingException {
//        log.info("Consumindo [" + avaliacao.toString() + "] no tópico");
//        System.out.println("\"Consumindo [\" + avaliacao.toString() + \"] no tópico\"");
//        ObjectMapper mapper = new ObjectMapper();
//        Avaliacao avaliacao = mapper.readValue(msg, Avaliacao.class);
//        System.out.println(avaliacao);
        return;
    }
}
