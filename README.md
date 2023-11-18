# Spring boot - RestClient

# Swagger OpenApi

Este é um exemplo de arquivo OpenAPI no formato 3.0.1 para uma API de integração Rest-Client.

## Informações

- **Título:** Swagger OpenApi
- **Descrição:** API de integração Rest-Client
- **Versão:** 1

## Servidores

- **URL:** http://localhost:8080
- **Descrição:** URL do servidor gerado

## Endpoints

### Verificar Elegibilidade do Cartão

- **Caminho:** /cred-cards/api/v1/eligibility/check
- **Método:** GET
- **Tags:** open-api
- **Resumo:** Verifica a elegibilidade do cartão
- **Operation ID:** obterElegilidade

#### Respostas

- **200 OK**
  - **Descrição:** Consulta realizada com sucesso
  - **Conteúdo:** Tipo de objeto

- **400 Bad Request**
  - **Descrição:** Parâmetros inválidos
  - **Conteúdo:** Tipo de objeto

- **404 Not Found**
  - **Descrição:** Requisição não encontrada
  - **Conteúdo:** Tipo de objeto

- **422 Unprocessable Entity**
  - **Descrição:** Requisição inválida
  - **Conteúdo:** Tipo de objeto

- **500 Internal Server Error**
  - **Descrição:** Erro ao realizar o upload de arquivo
  - **Conteúdo:** Tipo de objeto
