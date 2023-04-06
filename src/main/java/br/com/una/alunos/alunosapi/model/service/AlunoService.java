package br.com.una.alunos.alunosapi.model.service;

import br.com.una.alunos.alunosapi.model.dao.AlunoDao;
import br.com.una.alunos.alunosapi.model.domain.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    AlunoDao alunoDao;
    
    public void inserir(Aluno aluno) {
        alunoDao.save(aluno);
    }

    public void alterar(Long id, Aluno aluno) {
        aluno.setId(id);
        alunoDao.save(aluno);
    }

    public void delete(Long id){
        alunoDao.deleteById(id);
    }

    public List<Aluno> listAlunos() {
        return alunoDao.findAll();
    }
}
