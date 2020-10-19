package com.escola.avaliacao.servico;

import com.escola.avaliacao.entidade.Atividade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsConsumer {
    @Autowired
    private AnaliseService service;

    @JmsListener(destination = "${jms.queue.destination}")
    public void processToDo(Atividade atividade) {

    }
}
