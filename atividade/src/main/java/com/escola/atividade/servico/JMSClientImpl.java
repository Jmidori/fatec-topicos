package com.escola.atividade.servico;

import com.escola.atividade.http.data.AtividadeRequest;
import org.springframework.beans.factory.annotation.Autowired;

public class JMSClientImpl implements JMSClient{
    @Autowired
    JmsProducer jmsProducer;

    @Override
    public void envia(AtividadeRequest msg) {
        jmsProducer.enviaMensagem(msg);
    }
}
