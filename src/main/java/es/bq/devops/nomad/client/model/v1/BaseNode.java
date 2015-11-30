package es.bq.devops.nomad.client.model.v1;

import es.bq.devops.nomad.client.utils.Utils;

public class BaseNode {
    private String ID;
    private String Datacenter;
    private String Name;
    private String NodeClass;
    private boolean Drain;
    private String Status;
    private String StatusDescription;
    private int CreateIndex;
    private int ModifyIndex;

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getDatacenter() {
        return Datacenter;
    }

    public void setDatacenter(String datacenter) {
        Datacenter = datacenter;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNodeClass() {
        return NodeClass;
    }

    public void setNodeClass(String nodeClass) {
        NodeClass = nodeClass;
    }

    public boolean isDrain() {
        return Drain;
    }

    public void setDrain(boolean drain) {
        Drain = drain;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getStatusDescription() {
        return StatusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        StatusDescription = statusDescription;
    }

    public int getCreateIndex() {
        return CreateIndex;
    }

    public void setCreateIndex(int createIndex) {
        CreateIndex = createIndex;
    }

    public int getModifyIndex() {
        return ModifyIndex;
    }

    public void setModifyIndex(int modifyIndex) {
        ModifyIndex = modifyIndex;
    }

    @Override
    public String toString() {
        return Utils.toString(this);
    }
}
