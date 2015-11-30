package es.bq.devops.nomad.client.utils;

public class NomadException extends Exception {

    private static final long serialVersionUID = 1L;
    private int status;
    private String message;

    public NomadException(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
