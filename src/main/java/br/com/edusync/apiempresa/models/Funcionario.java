package br.com.edusync.apiempresa.models;

import lombok.Data;

@Data
public class Funcionario {

    private Integer codigo;
    private String nomeFuncionario;
    private String cpf;
    private String empresa;

}
