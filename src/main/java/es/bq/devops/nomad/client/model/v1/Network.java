package es.bq.devops.nomad.client.model.v1;

import java.util.ArrayList;
import java.util.List;

import es.bq.devops.nomad.client.utils.Utils;

public class Network {
    private String Device;
    private String CIDR;
    private String IP;
    private long MBits;
    private Object ReservedPorts; // TODO
    private List<LabelPort> DynamicPorts;

    private static final long MINIMUM_MBITS = 1;

    public Network() {
        this.DynamicPorts = new ArrayList<LabelPort>();
    }

    public Network(long mBits) {
        this();
        this.MBits = mBits;
    }

    public String getDevice() {
        return Device;
    }

    public void setDevice(String device) {
        Device = device;
    }

    public String getCIDR() {
        return CIDR;
    }

    public void setCIDR(String cIDR) {
        CIDR = cIDR;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String iP) {
        IP = iP;
    }

    public long getMBits() {
        return MBits;
    }

    public void setMBits(long mBits) {
        MBits = mBits;
    }

    public Object getReservedPorts() {
        return ReservedPorts;
    }

    public void setReservedPorts(Object reservedPorts) {
        ReservedPorts = reservedPorts;
    }

    public List<LabelPort> getDynamicPorts() {
        return DynamicPorts;
    }

    public void setDynamicPorts(List<LabelPort> dynamicPorts) {
        DynamicPorts = dynamicPorts;
    }

    public void addDynamicPort(LabelPort labelPort) {
        this.DynamicPorts.add(labelPort);
    }

    public void addDynamicPort(String label) {
        this.DynamicPorts.add(new LabelPort(label, 0));
    }

    @Override
    public String toString() {
        return Utils.toString(this);
    }

    public static Network Default() {
        return new Network(MINIMUM_MBITS);
    }
}
