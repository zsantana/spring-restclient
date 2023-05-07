package br.com.xbinario.restclient.controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import org.springframework.beans.factory.annotation.Value;

import br.com.xbinario.restclient.domain.Elegibilidade;
import br.com.xbinario.restclient.exceptions.ElegibilidadeClientException;
import br.com.xbinario.restclient.services.ElegibilidadeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;


import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;


@RestController
@RequestMapping(value = "/cred-cards/api/v1/eligibility")
@Tag(name = "open-api")
public class ElegibilidadeController {

    @Value("${URL}")
    String url;

    private final ElegibilidadeService service;

    public ElegibilidadeController(final ElegibilidadeService service) {
        this.service = service;
    }


    @Operation(summary = "Verifica a elegibilidade do cartão", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Consulta realizada com sucesso"),
            @ApiResponse(responseCode = "404", description = "Requisição não encontrada"),
            @ApiResponse(responseCode = "422", description = "Requisição inválida"),
            @ApiResponse(responseCode = "400", description = "Parametros inválidos"),
            @ApiResponse(responseCode = "500", description = "Erro ao realizar o upload de arquivo"),
    })
    @GetMapping(path = "/check")
    public <T> ResponseEntity<T> obterElegilidade() {
        
        try {
            
            var elegibilidade = service.getEligibility();
            return (ResponseEntity<T>) new ResponseEntity<List<Elegibilidade>>(elegibilidade, HttpStatus.OK);

        } catch (ElegibilidadeClientException e) {

            RetornoErroDTO retornoErroDTO = new RetornoErroDTO();
            retornoErroDTO.setCodErro("500");
            retornoErroDTO.setMsgErro(e.getMessage());

            return (ResponseEntity<T>) ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Collections.singletonList(retornoErroDTO));
        }
    }

}
