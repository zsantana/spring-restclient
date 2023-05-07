package br.com.xbinario.restclient.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.xbinario.restclient.domain.Elegibilidade;
import br.com.xbinario.restclient.domain.PagedResponse;
import br.com.xbinario.restclient.services.ElegibilidadeService;
import br.com.xbinario.restclient.services.ElegibilidadeClient;

@Service
public class ElegibilidadeServiceImpl implements ElegibilidadeService {

    private final ElegibilidadeClient eligibilityClient;

    public ElegibilidadeServiceImpl(final ElegibilidadeClient client) {
        this.eligibilityClient = client;
    }

    public List<Elegibilidade> getEligibility() {
        final PagedResponse<Elegibilidade> response = eligibilityClient.getEligibility();
        return response.getContent();
    }

}
