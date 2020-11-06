package com.escola.disciplina.repositorio;

import com.escola.disciplina.entidade.Avaliacao;
import com.escola.disciplina.entidade.DisciplinasAtividadesAnalitico2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IAvaliacaoRepository extends JpaRepository<Avaliacao, Long> {
//    @Query("SELECT new com.escola.disciplina.entidade.DisciplinasAtividadesAnalitico2(\n" +
//            "        A.disciplina as disciplina,\n" +
//            "        A.codigoAtividade as codigoAtividade,\n" +
//            "        COUNT(A.nota) as quantidadeAtividadesEntregues,\n" +
//            "        AVG(CONVERT(REPLACE(A.nota, ',','.'), double)) as mediaSala)\n" +
//            "        FROM Avaliacao A\n" +
//            "        GROUP BY A.disciplina, A.codigoAtividade")
//    public List<DisciplinasAtividadesAnalitico2> selectDisciplinasAtividadesAnalitico();
}




