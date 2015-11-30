package es.bq.devops.nomad.client.model.v1;

import java.util.Map;

import es.bq.devops.nomad.client.utils.Utils;

public class Client {
    private boolean Enabled;
    private String StateDir;
    private String AllocDir;
    private Object Servers; // TODO
    private String NodeID;
    private String NodeClass;
    private Map<String, String> Options;
    private Map<String, String> Meta;
    private String NetworkInterface;
    private int NetworkSpeed;

    public boolean isEnabled() {
        return Enabled;
    }

    public void setEnabled(boolean enabled) {
        Enabled = enabled;
    }

    public String getStateDir() {
        return StateDir;
    }

    public void setStateDir(String stateDir) {
        StateDir = stateDir;
    }

    public String getAllocDir() {
        return AllocDir;
    }

    public void setAllocDir(String allocDir) {
        AllocDir = allocDir;
    }

    public Object getServers() {
        return Servers;
    }

    public void setServers(Object servers) {
        Servers = servers;
    }

    public String getNodeID() {
        return NodeID;
    }

    public void setNodeID(String nodeID) {
        NodeID = nodeID;
    }

    public String getNodeClass() {
        return NodeClass;
    }

    public void setNodeClass(String nodeClass) {
        NodeClass = nodeClass;
    }

    public Map<String, String> getOptions() {
        return Options;
    }

    public void setOptions(Map<String, String> options) {
        Options = options;
    }

    public Map<String, String> getMeta() {
        return Meta;
    }

    public void setMeta(Map<String, String> meta) {
        Meta = meta;
    }

    public String getNetworkInterface() {
        return NetworkInterface;
    }

    public void setNetworkInterface(String networkInterface) {
        NetworkInterface = networkInterface;
    }

    public int getNetworkSpeed() {
        return NetworkSpeed;
    }

    public void setNetworkSpeed(int networkSpeed) {
        NetworkSpeed = networkSpeed;
    }

    @Override
    public String toString() {
        return Utils.toString(this);
    }
}
