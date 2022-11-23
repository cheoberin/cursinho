package br.com.atos.cursinhoatos.controller;


import br.com.atos.cursinhoatos.model.Disciplina;
import br.com.atos.cursinhoatos.service.DisciplinaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/disciplina")
public class DisciplinaController {

    private final DisciplinaService disciplinaService;

    @PostMapping("/salvar")
    public Disciplina salvar(@RequestBody Disciplina disciplina) {
        return disciplinaService.salvar(disciplina);
        //TODO criar saporra
    }

    @GetMapping("/listar")
    public List<Disciplina> listarTodos(){
        return disciplinaService.listarTodos();
    }
}
