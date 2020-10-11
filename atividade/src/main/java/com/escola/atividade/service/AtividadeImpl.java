package com.escola.atividade.service;

import com.escola.atividade.http.data.AtividadeRequest;
import org.springframework.stereotype.Service;

@Service
public class AtividadeImpl implements IAtividade {
    @Override
    public void enviaFila(AtividadeRequest request) {
        System.out.println("hoi! spring neah?");
    }
}
