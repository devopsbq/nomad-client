package es.bq.devops.nomad.client.model.v1;

import es.bq.devops.nomad.client.utils.Utils;

public class AgentAddresses {
    private String HTTP;
    private String RPC;
    private String Serf;

    public String getHTTP() {
        return HTTP;
    }

    public void setHTTP(String hTTP) {
        HTTP = hTTP;
    }

    public String getRPC() {
        return RPC;
    }

    public void setRPC(String rPC) {
        RPC = rPC;
    }

    public String getSerf() {
        return Serf;
    }

    public void setSerf(String serf) {
        this.Serf = serf;
    }

    @Override
    public String toString() {
        return Utils.toString(this);
    }
}
