package br.com.xbinario.restclient.controllers;

import lombok.Data;

@Data
public class RetornoErroDTO {
    
    private String codErro;
    private String msgErro;
}
