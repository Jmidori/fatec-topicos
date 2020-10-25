package com.escola.aluno.controller;

import com.escola.aluno.entidade.Avaliacao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.Payload;

import javax.jms.JMSException;

public class TopicoDestinoConsumer {
    private static Logger log = LoggerFactory.getLogger(TopicoDestinoConsumer.class);

    @JmsListener(destination = "${jms.queue.destination}")
    public void consumir(@Payload Avaliacao avaliacao) throws JMSException {
        log.info("Consumindo [" + avaliacao.toString() + "] no tópico");
        System.out.println("\"Consumindo [\" + avaliacao.toString() + \"] no tópico\"");
    }
}
