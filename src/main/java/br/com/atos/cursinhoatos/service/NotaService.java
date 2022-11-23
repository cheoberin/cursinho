package br.com.atos.cursinhoatos.service;

import br.com.atos.cursinhoatos.model.Nota;
import br.com.atos.cursinhoatos.repository.NotaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NotaService {

    private final NotaRepository notaRepository;

    public Nota salvar(Nota nota) {
        return notaRepository.save(nota);
    }

    public List<Nota> listarTodos() {
        return notaRepository.findAll();
    }
}
