package br.com.xbinario.restclient.services.impl;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import br.com.xbinario.restclient.domain.Elegibilidade;
import br.com.xbinario.restclient.domain.PagedResponse;
import br.com.xbinario.restclient.exceptions.ElegibilidadeClientException;
import br.com.xbinario.restclient.services.ElegibilidadeClient;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ElegibilidadeClientImpl implements ElegibilidadeClient {

    @Value("${URL}")
    String url;

    private final RestTemplate restTemplate;

    public ElegibilidadeClientImpl(final RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public PagedResponse<Elegibilidade> getEligibility()  {
        
        log.info("### URL {}: ", this.url);

        try {

            final Elegibilidade response = restTemplate.getForObject( this.url, Elegibilidade.class);

            PagedResponse<Elegibilidade> retorno = new PagedResponse<>();
            retorno.setContent(Collections.singletonList(response));

            return retorno;

        } catch (RestClientException ex) {
            throw createException("Erro na chamada da API Rest: " + this.url, ex);
        }  catch (Exception e){
            throw createException("Erro na chamada da API Rest", e);
        }

    }


    private static ElegibilidadeClientException createException(String message, Throwable cause) {
        log.error("ERROR {} ", message);
        return new ElegibilidadeClientException(message, cause);
    }

}
