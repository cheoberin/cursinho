package br.com.atos.cursinhoatos.service;

import br.com.atos.cursinhoatos.model.Disciplina;
import br.com.atos.cursinhoatos.repository.DisciplinaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DisciplinaService {

    private final DisciplinaRepository disciplinaRepository;

    public Disciplina salvar(Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }

    public List<Disciplina> listarTodos() {
        return disciplinaRepository.findAll();
    }

}
