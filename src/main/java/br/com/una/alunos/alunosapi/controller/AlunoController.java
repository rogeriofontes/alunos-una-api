package br.com.una.alunos.alunosapi.controller;

import br.com.una.alunos.alunosapi.model.domain.Aluno;
import br.com.una.alunos.alunosapi.model.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @PostMapping
    public ResponseEntity<?> inserir(Aluno aluno) {
        alunoService.inserir(aluno);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(1).toUri();
        return ResponseEntity.created(uri).body("Aluno cadastrado");
    }

    @PutMapping
    public ResponseEntity<?> alterar(Aluno aluno) {
        alunoService.alterar(aluno);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity<?> delete(Aluno aluno){
        alunoService.delete(aluno);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<Aluno>> listAlunos() {
        List<Aluno> alunoList = alunoService.listAlunos();
        return ResponseEntity.ok(alunoList);
    }
}
