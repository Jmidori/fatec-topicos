package com.escola.atividade.servico;

import com.escola.atividade.entidade.Atividade;
import com.escola.atividade.http.data.AtividadeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class JmsProducer {

    @Autowired
    JmsTemplate jmsTemplate;

    @Value("${active-mq.queue.destination}")
    private String fila;

    public void enviaMensagem(AtividadeRequest mensagem){
        try{
            jmsTemplate.convertAndSend(fila,mensagem);
        } catch (RuntimeException e){
            System.out.println("--- Erro ao enviar a mensagem. Erro: " + e.getMessage());
        }
    }



}
