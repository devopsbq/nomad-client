package es.bq.devops.nomad.client.model.v1;

import es.bq.devops.nomad.client.utils.Utils;

public class AtlasConfig {
    private String Infrastructure;
    private boolean Join;
    private String Endpoint;

    public String getInfrastructure() {
        return Infrastructure;
    }

    public void setInfrastructure(String infrastructure) {
        Infrastructure = infrastructure;
    }

    public boolean isJoin() {
        return Join;
    }

    public void setJoin(boolean join) {
        Join = join;
    }

    public String getEndpoint() {
        return Endpoint;
    }

    public void setEndpoint(String endpoint) {
        Endpoint = endpoint;
    }

    @Override
    public String toString() {
        return Utils.toString(this);
    }
}
