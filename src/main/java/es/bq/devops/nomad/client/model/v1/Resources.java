package es.bq.devops.nomad.client.model.v1;

import java.util.ArrayList;
import java.util.List;

import es.bq.devops.nomad.client.utils.Utils;

public class Resources {
    private long CPU;
    private long MemoryMB;
    private long DiskMB;
    private long IOPS;
    private List<Network> Networks;

    public Resources() {
        this.Networks = new ArrayList<Network>();
    }

    public Resources(long cpu, long memoryMB) {
        this();
        this.CPU = cpu;
        this.MemoryMB = memoryMB;
    }

    public long getCPU() {
        return CPU;
    }

    public void setCPU(long cPU) {
        CPU = cPU;
    }

    public long getMemoryMB() {
        return MemoryMB;
    }

    public void setMemoryMB(long memoryMB) {
        MemoryMB = memoryMB;
    }

    public long getDiskMB() {
        return DiskMB;
    }

    public void setDiskMB(long diskMB) {
        DiskMB = diskMB;
    }

    public long getIOPS() {
        return IOPS;
    }

    public void setIOPS(long iOPS) {
        IOPS = iOPS;
    }

    public List<Network> getNetworks() {
        return Networks;
    }

    public void setNetworks(List<Network> networks) {
        Networks = networks;
    }

    public void addNetwork(Network network) {
        this.Networks.add(network);
    }

    @Override
    public String toString() {
        return Utils.toString(this);
    }
}
