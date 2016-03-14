package es.bq.devops.nomad.client.model.v1;

public enum ClientStatus {
    PENDING("pending"), RUNNING("running"), DEAD("dead"), FAILED("failed");

    private String name;

    private ClientStatus(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
