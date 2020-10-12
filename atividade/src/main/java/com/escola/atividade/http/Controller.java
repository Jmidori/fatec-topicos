package com.escola.atividade.http;

import com.escola.atividade.http.data.AtividadeRequest;
import com.escola.atividade.servico.JMSClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividade")
public class Controller {

    @Autowired
    JMSClient client;

    @PostMapping("/envio")
    public ResponseEntity<Object> enviaAtividade(AtividadeRequest request){
        try{
            client.envia(request);
            return new ResponseEntity<>(HttpStatus.CREATED);

        } catch (RuntimeException e){
            return new ResponseEntity<>(HttpStatus.SERVICE_UNAVAILABLE);
        }
    }

//    @GetMapping("/healthcheck")
//    public ResponseEntity<HealthCheckResponse> obterHealthCheck(){
//        HealthCheckResponse status = service.checkApplicationHealth();
//        return new ResponseEntity<HealthCheckResponse>(status,HttpStatus.OK);
//    }
}
