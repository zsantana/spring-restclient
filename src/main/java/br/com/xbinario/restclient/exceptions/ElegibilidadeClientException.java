package br.com.xbinario.restclient.exceptions;

public class ElegibilidadeClientException extends RuntimeException {

    public ElegibilidadeClientException() {
    }

    public ElegibilidadeClientException(String message) {
        super(message);
    }

    public ElegibilidadeClientException(Throwable cause) {
        super(cause);
    }

    public ElegibilidadeClientException(String message, Throwable cause) {
        super(message, cause);
    }

    public ElegibilidadeClientException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
