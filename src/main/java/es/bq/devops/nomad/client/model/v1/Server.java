package es.bq.devops.nomad.client.model.v1;

import es.bq.devops.nomad.client.utils.Utils;

public class Server {
    private boolean Enabled;
    private boolean Bootstrap;
    private int BootstrapExpect;
    private String DataDir;
    private int ProtocolVersion;
    private int NumSchedulers;
    private Object EnabledSchedulers;

    public boolean isEnabled() {
        return Enabled;
    }

    public void setEnabled(boolean enabled) {
        Enabled = enabled;
    }

    public boolean isBootstrap() {
        return Bootstrap;
    }

    public void setBootstrap(boolean bootstrap) {
        Bootstrap = bootstrap;
    }

    public int getBootstrapExpect() {
        return BootstrapExpect;
    }

    public void setBootstrapExpect(int bootstrapExpect) {
        this.BootstrapExpect = bootstrapExpect;
    }

    public String getDataDir() {
        return DataDir;
    }

    public void setDataDir(String dataDir) {
        DataDir = dataDir;
    }

    public int getProtocolVersion() {
        return ProtocolVersion;
    }

    public void setProtocolVersion(int protocolVersion) {
        ProtocolVersion = protocolVersion;
    }

    public int getNumSchedulers() {
        return NumSchedulers;
    }

    public void setNumSchedulers(int numSchedulers) {
        NumSchedulers = numSchedulers;
    }

    public Object getEnabledSchedulers() {
        return EnabledSchedulers;
    }

    public void setEnabledSchedulers(Object enabledSchedulers) {
        EnabledSchedulers = enabledSchedulers;
    }

    @Override
    public String toString() {
        return Utils.toString(this);
    }
}
