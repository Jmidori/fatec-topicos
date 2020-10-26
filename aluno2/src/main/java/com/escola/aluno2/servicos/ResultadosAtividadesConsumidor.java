package com.escola.aluno2.servicos;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ResultadosAtividadesConsumidor {
    @JmsListener(destination = "${destination.resultado-atividade-topico}")
    public void consumir(String message) {
        System.out.println(message);
    }
}
