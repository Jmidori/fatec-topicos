package com.escola.disciplina.servicos;

import com.escola.disciplina.entidade.Avaliacao;
import com.escola.disciplina.repositorio.IAvaliacaoRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ResultadosAtividadesConsumidor {

    private final IAvaliacaoRepository avaliacaoRepository;

    @Autowired
    public ResultadosAtividadesConsumidor(IAvaliacaoRepository avaliacaoRepository) {
        this.avaliacaoRepository = avaliacaoRepository;
    }

    @JmsListener(destination = "${destination.resultado-atividade-topico}")
    public void consumir(String message) throws JsonProcessingException {
        System.out.println(String.format("<- recebendo avaliação: %s", message));

        ObjectMapper mapper = new ObjectMapper();
        Avaliacao avaliacao = mapper.readValue(message, Avaliacao.class);
        avaliacao = this.avaliacaoRepository.save(avaliacao);

        System.out.println(
                String.format("avaliação %s do aluno %s foi persistida com o id %s!",
                        avaliacao.getCodigoAtividade(),
                        avaliacao.getNome(),
                        avaliacao.getId()));
    }
}

