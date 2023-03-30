package br.com.una.alunos.alunosapi.model.service;

import br.com.una.alunos.alunosapi.model.dao.AlunoDao;
import br.com.una.alunos.alunosapi.model.domain.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    //AlunoDao alunoDao = new AlunoDao();
    @Autowired
    AlunoDao alunoDao;


    /*public AlunoService(AlunoDao alunoDao) {
        this.alunoDao = alunoDao;
    }*/

    public void inserir(Aluno aluno) {
       if (!aluno.getMatricula().equals("232423423")) {
           alunoDao.inserir(aluno);
       }
    }

    public void alterar(Aluno aluno) {
        alunoDao.alterar(aluno);
    }

    public void delete(Aluno aluno){
        alunoDao.delete(aluno);
    }

    public List<Aluno> listAlunos() {
        return alunoDao.listAlunos();
    }
}
