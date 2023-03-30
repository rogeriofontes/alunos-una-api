package br.com.una.alunos.alunosapi.model.dao;

import br.com.una.alunos.alunosapi.model.domain.Aluno;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlunoDao {

    List<Aluno> alunoList = new ArrayList<>();

    public void inserir(Aluno aluno) {
        alunoList.add(aluno);
    }

    public void alterar(Aluno aluno) {
       // alunoList.get()
        alunoList.add(aluno);
    }

    public void delete(Aluno aluno){
        alunoList.remove(aluno);
    }

    public List<Aluno> listAlunos() {
        return alunoList;
    }
}
