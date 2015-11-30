package es.bq.devops.nomad.client.model.v1;

import es.bq.devops.nomad.client.utils.Utils;

public class AgentPorts {
    private int HTTP;
    private int RPC;
    private int Serf;

    public int getHTTP() {
        return HTTP;
    }

    public void setHTTP(int hTTP) {
        HTTP = hTTP;
    }

    public int getRPC() {
        return RPC;
    }

    public void setRPC(int rPC) {
        this.RPC = rPC;
    }

    public int getSerf() {
        return Serf;
    }

    public void setSerf(int serf) {
        this.Serf = serf;
    }

    @Override
    public String toString() {
        return Utils.toString(this);
    }
}
