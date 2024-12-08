package br.com.edusync.apiempresa.services;

import br.com.edusync.apiempresa.models.Empresa;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaService {

    private List<Empresa> empresas = new ArrayList<>();
    public void adicionar(Empresa empresaQueSeraSalva) {
        empresas.add(empresaQueSeraSalva);
    }

    public List<Empresa> listarTudo() {
        return empresas;
    }

    public Empresa buscarPorCodigo (Integer codigo) {
        return empresas.stream().filter(p -> codigo.equals(p.getCodigo())).findFirst().orElseThrow();
    }

    public void update(Integer codigo, Empresa empresa) {
        remover(codigo);
        adicionar(empresa);
    }

    public void remover(Integer codigo) {
        Empresa empresaPesquisa = buscarPorCodigo(codigo);
        if (empresaPesquisa != null) {
            empresas.remove(empresaPesquisa);
        }
    }
}
