# API (Interface de Programação de Aplicações) de Empresa
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) ![Postman](https://img.shields.io/badge/Postman-FF6C37.svg?style=for-the-badge&logo=Postman&logoColor=white)

Este projeto é uma API (Interface de Programação de Aplicações) que foi baseado no diagrama de classes, abaixo, utilizando JAVA, Spring Boot, com documenção Swagger, conforme solicitado nos exercícios do Curso TI 360 TECH - Formação de Profissional 4.0, do Weslley Borges - Executivo de TI, para obter maior conhecimento na linguagem.

![alt text](image.png)

## Responsabilidades da API (Interface de Programação de Aplicações)
- Retornar uma lista de todas as empresas cadastradas,
- Retornar uma empresa cadastrada, filtrando por código, retornando "OK - Tarefa Encontrada", "ERRO - Tarefa não localizada" ou "Erro Inesperado,
- Cadastrar novas empresas.
- Deletar uma empresa cadastrada.

## Ferramenta utilizada para realização de testes
Para verificar se o código estava funcionando corretamente foi utilizada as Ferramentas POSTMAN e SWAGGER, apresentando a mensagem abaixo relacionada no Body do cadastro:

{
    
    "id": 1,
    "Nome da Empresa": "Teste",
    "CNPJ": "Teste",
    "Funcionarios": "Teste"    
}
