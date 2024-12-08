package br.com.edusync.apiempresa.controllers;

import br.com.edusync.apiempresa.models.Empresa;
import br.com.edusync.apiempresa.services.EmpresaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/empresas")
@RestController
public class EmpresaController {

    @Autowired
    private EmpresaService service;

    @PostMapping(value = "/nova")
    @Operation(summary = "NOVA EMPRESA", description = "ADICIONA UMA NOVA EMPRESA")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK - EMPRESA ENCONTRADA"),
            @ApiResponse(responseCode = "404", description = "ERRO - EMPRESA NÃO LOCALIZADA"),
            @ApiResponse(responseCode = "500", description = "ERRO INESPERADO")
    })
    public ResponseEntity novaEmpresa(@RequestBody Empresa empresa) {
        service.adicionar(empresa);
        return new ResponseEntity(empresa, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity listarTodas() {

        return new ResponseEntity(service.listarTudo(), HttpStatus.OK);
    }

    @GetMapping(value = "/{codigo}")
    @Operation(summary = "OBTER EMPRESA", description = "DADO O CODIGO DA EMPRESA, LISTA SUAS INFORMAÇÕES")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK - EMPRESA ENCONTRADA"),
            @ApiResponse(responseCode = "404", description = "ERRO - EMPRESA NÃO LOCALIZADA"),
            @ApiResponse(responseCode = "500", description = "ERRO INESPERADO")
    })
    public ResponseEntity listarPorCodigo(@PathVariable Integer codigo) {
        return new ResponseEntity(service.buscarPorCodigo(codigo), HttpStatus.OK);
    }

    @PutMapping(value = "/{codigo}")
    @Operation(summary = "ALTERA EMPRESA", description = "ALTERA DADOS DA EMPRESA")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK - EMPRESA ENCONTRADA"),
            @ApiResponse(responseCode = "404", description = "ERRO - EMPRESA NÃO LOCALIZADA"),
            @ApiResponse(responseCode = "500", description = "ERRO INESPERADO")
    })
    public ResponseEntity alterar(@PathVariable Integer codigo, @RequestBody Empresa empresa) {
        service.update(codigo, empresa);
        return new ResponseEntity(empresa, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{codigo}")
    @Operation(summary = "REMOVER", description = "DELETA A EMPRESA SELECIONADA")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK - EMPRESA ENCONTRADA"),
            @ApiResponse(responseCode = "404", description = "ERRO - EMPRESA NÃO LOCALIZADA"),
            @ApiResponse(responseCode = "500", description = "ERRO INESPERADO")
    })
    public ResponseEntity remover(@PathVariable Integer codigo){
        service.remover(codigo);
        return new ResponseEntity(HttpStatus.OK);
    }

}
