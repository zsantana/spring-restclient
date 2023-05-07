package br.com.xbinario.restclient.services;


import br.com.xbinario.restclient.domain.Elegibilidade;
import br.com.xbinario.restclient.domain.PagedResponse;

/**
 * Handles HTTP calls to the Books server
 */
public interface ElegibilidadeClient {

    PagedResponse<Elegibilidade> getEligibility();

}
