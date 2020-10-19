package com.escola.atividade.servico;

import com.escola.atividade.http.data.AtividadeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JMSClientImpl implements JMSClient{
    @Autowired
    JmsProducer jmsProducer;

    @Override
    public void envia(String msg) {
        jmsProducer.enviaMensagem(msg);
    }
}
