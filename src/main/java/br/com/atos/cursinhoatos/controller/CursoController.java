package br.com.atos.cursinhoatos.controller;


import br.com.atos.cursinhoatos.model.Curso;
import br.com.atos.cursinhoatos.service.CursoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/curso")
public class CursoController {

    private final CursoService cursoService;

    @PostMapping("/salvar")
    public Curso salvar(@RequestBody Curso curso){
        return cursoService.salvar(curso);
    }

    @GetMapping("/listar")
    public List<Curso> listarTodos(){
        return cursoService.listarTodos();
    }
}
