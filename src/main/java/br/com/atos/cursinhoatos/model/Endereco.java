package br.com.atos.cursinhoatos.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Endereco {

    @JsonProperty(value = "logradouro")
    private String rua;

    private int numero;

    private String complemento;

    private String cep;

    private String uf;

    @JsonProperty(value = "localidade")
    private String cidade;

}
