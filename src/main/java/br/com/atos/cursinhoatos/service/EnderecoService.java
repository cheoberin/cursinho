package br.com.atos.cursinhoatos.service;

import br.com.atos.cursinhoatos.model.Endereco;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class EnderecoService {

    public Endereco getEndereco(String cep){
        String url = "https://viacep.com.br/ws/" + cep + "/json";
        Endereco endereco = new RestTemplate().getForObject(url, Endereco.class);
        return endereco;
    }

}
