package br.com.edusync.apiempresa.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Empresa {

    private Integer codigo;
    private String nomeEmpresa;
    private String cnpj;
    private List<Funcionario> funcionarios = new ArrayList<>();

}
