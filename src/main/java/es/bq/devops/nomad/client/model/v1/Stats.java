package es.bq.devops.nomad.client.model.v1;

import java.util.Map;

import es.bq.devops.nomad.client.utils.Utils;

public class Stats {
    private Map<String, String> client;
    private Map<String, String> nomad;
    private Map<String, String> raft;
    private Map<String, String> runtime;
    private Map<String, String> serf;

    public Map<String, String> getClient() {
        return client;
    }

    public void setClient(Map<String, String> client) {
        this.client = client;
    }

    public Map<String, String> getNomad() {
        return nomad;
    }

    public void setNomad(Map<String, String> nomad) {
        this.nomad = nomad;
    }

    public Map<String, String> getRaft() {
        return raft;
    }

    public void setRaft(Map<String, String> raft) {
        this.raft = raft;
    }

    public Map<String, String> getRuntime() {
        return runtime;
    }

    public void setRuntime(Map<String, String> runtime) {
        this.runtime = runtime;
    }

    public Map<String, String> getSerf() {
        return serf;
    }

    public void setSerf(Map<String, String> serf) {
        this.serf = serf;
    }

    @Override
    public String toString() {
        return Utils.toString(this);
    }
}
