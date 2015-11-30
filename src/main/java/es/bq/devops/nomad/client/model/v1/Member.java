package es.bq.devops.nomad.client.model.v1;

import java.util.Map;

import es.bq.devops.nomad.client.utils.Utils;

public class Member {
    private String Name;
    private String Addr;
    private int Port;
    private Map<String, String> Tags;
    private String Status;
    private int ProtocolMin;
    private int ProtocolMax;
    private int ProtocolCur;
    private int DelegateMin;
    private int DelegateMax;
    private int DelegateCur;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getAddr() {
        return Addr;
    }

    public void setAddr(String addr) {
        this.Addr = addr;
    }

    public int getPort() {
        return Port;
    }

    public void setPort(int port) {
        this.Port = port;
    }

    public Map<String, String> getTags() {
        return Tags;
    }

    public void setTags(Map<String, String> tags) {
        this.Tags = tags;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        this.Status = status;
    }

    public int getProtocolMin() {
        return ProtocolMin;
    }

    public void setProtocolMin(int protocolMin) {
        ProtocolMin = protocolMin;
    }

    public int getProtocolMax() {
        return ProtocolMax;
    }

    public void setProtocolMax(int protocolMax) {
        ProtocolMax = protocolMax;
    }

    public int getProtocolCur() {
        return ProtocolCur;
    }

    public void setProtocolCur(int protocolCur) {
        ProtocolCur = protocolCur;
    }

    public int getDelegateMin() {
        return DelegateMin;
    }

    public void setDelegateMin(int delegateMin) {
        DelegateMin = delegateMin;
    }

    public int getDelegateMax() {
        return DelegateMax;
    }

    public void setDelegateMax(int delegateMax) {
        DelegateMax = delegateMax;
    }

    public int getDelegateCur() {
        return DelegateCur;
    }

    public void setDelegateCur(int delegateCur) {
        DelegateCur = delegateCur;
    }

    @Override
    public String toString() {
        return Utils.toString(this);
    }
}
