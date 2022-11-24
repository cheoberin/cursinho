package br.com.atos.cursinhoatos.service;

import br.com.atos.cursinhoatos.model.Aluno;
import br.com.atos.cursinhoatos.model.Endereco;
import br.com.atos.cursinhoatos.repository.AlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlunoService {

    private final AlunoRepository alunoRepository;
    private final EnderecoService enderecoService;

    public Aluno salvar(Aluno aluno) {

        String cep = aluno.getEndereco().getCep();
        int numero = aluno.getEndereco().getNumero();
        String complemento = aluno.getEndereco().getComplemento();

        if (!ObjectUtils.isEmpty(cep)) {
            Endereco endereco = enderecoService.getEndereco(cep);
            endereco.setNumero(numero);
            endereco.setComplemento(complemento);
            aluno.setEndereco(endereco);
        }

        return alunoRepository.save(aluno);
    }

    public List<Aluno> listarTodos() {
        return alunoRepository.findAll();
    }
}
