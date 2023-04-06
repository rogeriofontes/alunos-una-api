package br.com.una.alunos.alunosapi.model.dao;

import br.com.una.alunos.alunosapi.model.domain.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoDao extends JpaRepository<Aluno, Long> {
}
