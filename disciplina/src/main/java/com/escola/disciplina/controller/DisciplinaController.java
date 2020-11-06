package com.escola.disciplina.controller;

import com.escola.disciplina.entidade.Avaliacao;
import com.escola.disciplina.entidade.DisciplinasAtividadesAnalitico;
import com.escola.disciplina.entidade.DisciplinasAtividadesAnalitico2;
import com.escola.disciplina.entidade.MediaSimplesAtividades;
import com.escola.disciplina.repositorio.IAvaliacaoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/disciplinas")
@CrossOrigin
public class DisciplinaController {
    private final IAvaliacaoRepository repository;

    public DisciplinaController(IAvaliacaoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/group")
    public ResponseEntity<HashMap<String, HashMap<String, MediaSimplesAtividades>>> buscaTodasDisciplinasAtividades() {
        List<Avaliacao> avaliacaos = repository.findAll();
        HashMap<String, HashMap<String, MediaSimplesAtividades>> disciplinasAtividades = DisciplinasAtividadesAnalitico.extractFrom(avaliacaos);

        return new ResponseEntity<>(disciplinasAtividades, HttpStatus.OK);
    }

    @GetMapping("/inline")
    public ResponseEntity<List<DisciplinasAtividadesAnalitico2>> buscaTodasDisciplinasAtividades2() {
        List<Avaliacao> avaliacaos = repository.findAll();
        List<DisciplinasAtividadesAnalitico2> disciplinasAtividadesAnaliticoRetorno = DisciplinasAtividadesAnalitico2.extractFrom(avaliacaos);

        return new ResponseEntity<>(disciplinasAtividadesAnaliticoRetorno, HttpStatus.OK);
    }
}


