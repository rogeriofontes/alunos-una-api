package br.com.una.alunos.alunosapi.model.domain;

import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//@Setter
//@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Aluno implements Serializable {
    private Long id;
    private String nome;
    private Integer matricula;


}
