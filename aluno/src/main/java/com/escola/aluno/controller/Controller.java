package com.escola.aluno.controller;

import com.escola.aluno.entidade.Avaliacao;
import com.escola.aluno.repositorio.IAvaliacaoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class Controller {

    private final IAvaliacaoRepository repository;

    public Controller(IAvaliacaoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/atividades")
    public ResponseEntity<List<Avaliacao>> buscaTodasAtividades(){
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/atividade/{ra}")
    public ResponseEntity<List<Avaliacao>> buscaTodasAtividadesPorRA(@PathVariable(value = "ra") String ra){
        List<Avaliacao> avaliacoes = repository.findByRa(ra);

        return new ResponseEntity<>(avaliacoes, HttpStatus.OK);
    }


    @PostMapping("/atividade")
    public ResponseEntity<Object> registraAvaliacao(@RequestBody Avaliacao request){
        repository.save(request);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
