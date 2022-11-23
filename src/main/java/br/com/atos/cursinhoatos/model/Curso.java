package br.com.atos.cursinhoatos.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private String codigo;

    @ManyToMany
    private List<Disciplina> disciplinas;

}
