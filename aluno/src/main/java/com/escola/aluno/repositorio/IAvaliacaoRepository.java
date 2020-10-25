package com.escola.aluno.repositorio;

import com.escola.aluno.entidade.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface IAvaliacaoRepository extends JpaRepository<Avaliacao, Long> {
    List<Avaliacao> findByRa(String ra);
}
