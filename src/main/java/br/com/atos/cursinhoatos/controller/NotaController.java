package br.com.atos.cursinhoatos.controller;


import br.com.atos.cursinhoatos.model.Nota;
import br.com.atos.cursinhoatos.service.NotaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/nota")
public class NotaController {

    private final NotaService notaService;

    @PostMapping("/salvar")
    public Nota salvar(@RequestBody Nota nota){
        return notaService.salvar(nota);
    }

    @GetMapping("/listar")
    public List<Nota> listarTodos(){
        return notaService.listarTodos();
    }


}
