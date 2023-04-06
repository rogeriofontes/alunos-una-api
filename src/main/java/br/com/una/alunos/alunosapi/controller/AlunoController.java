package br.com.una.alunos.alunosapi.controller;

import br.com.una.alunos.alunosapi.model.domain.Aluno;
import br.com.una.alunos.alunosapi.model.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @PostMapping
    public ResponseEntity<?> inserir(@RequestBody Aluno aluno) {
        alunoService.inserir(aluno);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(1).toUri();
        return ResponseEntity.created(uri).body("Aluno cadastrado");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> alterar(@PathVariable Long id, @RequestBody Aluno aluno) {
        alunoService.alterar(id, aluno);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        alunoService.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<Aluno>> listAlunos() {
        List<Aluno> alunoList = alunoService.listAlunos();
        return ResponseEntity.ok(alunoList);
    }
}
