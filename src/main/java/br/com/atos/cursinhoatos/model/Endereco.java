package br.com.atos.cursinhoatos.model;


import lombok.Data;

@Data
public class Endereco {

    private String rua;
    private int numero;
    private String complemento;
    private String cep;
    private String uf;
    private String cidade;

}
