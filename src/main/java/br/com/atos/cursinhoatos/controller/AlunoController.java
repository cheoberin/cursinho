package br.com.atos.cursinhoatos.controller;

import br.com.atos.cursinhoatos.model.Aluno;
import br.com.atos.cursinhoatos.service.AlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/aluno")
public class AlunoController {

    private final AlunoService alunoService;

    @PostMapping("/salvar")
    public Aluno salvar(@RequestBody Aluno aluno){
        return alunoService.salvar(aluno);
    }

    @GetMapping("/listar")
    public List<Aluno> listarTodos(){
        return alunoService.listarTodos();
    }
}
