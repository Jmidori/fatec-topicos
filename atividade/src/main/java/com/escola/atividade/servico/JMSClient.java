package com.escola.atividade.servico;

import com.escola.atividade.http.data.AtividadeRequest;

public interface JMSClient {
    public void envia(AtividadeRequest msg);
}
