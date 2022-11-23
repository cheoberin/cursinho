package br.com.atos.cursinhoatos.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Nota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private double valor;
    private String tipoNota;

    @ManyToMany
    private List<Disciplina> disciplinas;

}
