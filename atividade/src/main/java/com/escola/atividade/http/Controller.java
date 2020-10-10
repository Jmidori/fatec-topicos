package com.escola.atividade.http;

import com.escola.atividade.http.data.AtividadeRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/atividade")
public class Controller {
    private final AtividadeService service;

    @PostMapping("/envio")
    public ResponseEntity<Object> enviaAtividade(AtividadeRequest request){
        try{
            service.enviaFila(request);
            return new ResponseEntity<>(HttpStatus.CREATED);

        } catch (RuntimeException e){
            return new ResponseEntity<>(HttpStatus.SERVICE_UNAVAILABLE);
        }
    }

    @GetMapping("/healthcheck")
    public ResponseEntity<HealthCheckResponse> obterHealthCheck(){
        HealthCheckResponse status = service.checkApplicationHealth();
        return new ResponseEntity<HealthCheckResponse>(status,HttpStatus.OK);
    }
}
