package com.escola.atividade.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class JmsProducer {

    @Autowired
    JmsTemplate jmsTemplate;

    @Value("${jms.queue.destination}")
    private String fila;

    public void enviaMensagem(String mensagem){
        try{
            jmsTemplate.convertAndSend(fila,mensagem);
        } catch (Exception e){
            System.out.println("--- Erro ao enviar a mensagem. Erro: " + e.getMessage());
        }
    }



}
