# Spring boot - RestClient

{
  "openapi": "3.0.1",
  "info": {
    "title": "Swagger OpenApi",
    "description": "API de integração Rest-Client",
    "version": "1"
  },
  "servers": [
    {
      "url": "http://localhost:8080",
      "description": "Generated server url"
    }
  ],
  "paths": {
    "/cred-cards/api/v1/eligibility/check": {
      "get": {
        "tags": [
          "open-api"
        ],
        "summary": "Verifica a elegibilidade do cartão",
        "operationId": "obterElegilidade",
        "responses": {
          "200": {
            "description": "Consulta realizada com sucesso",
            "content": {
              "*/*": {
                "schema": {
                  "type": "object"
                }
              }
            }
          },
          "400": {
            "description": "Parametros inválidos",
            "content": {
              "*/*": {
                "schema": {
                  "type": "object"
                }
              }
            }
          },
          "404": {
            "description": "Requisição não encontrada",
            "content": {
              "*/*": {
                "schema": {
                  "type": "object"
                }
              }
            }
          },
          "422": {
            "description": "Requisição inválida",
            "content": {
              "*/*": {
                "schema": {
                  "type": "object"
                }
              }
            }
          },
          "500": {
            "description": "Erro ao realizar o upload de arquivo",
            "content": {
              "*/*": {
                "schema": {
                  "type": "object"
                }
              }
            }
          }
        }
      }
    }
  },
  "components": {}
}