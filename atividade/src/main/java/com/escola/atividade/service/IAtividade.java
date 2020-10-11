package com.escola.atividade.service;

import com.escola.atividade.http.data.AtividadeRequest;

public interface IAtividade {
    void enviaFila(AtividadeRequest request);

//    HealthCheckResponse checkApplicationHealth();
}
