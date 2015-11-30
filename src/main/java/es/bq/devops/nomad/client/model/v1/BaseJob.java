package es.bq.devops.nomad.client.model.v1;

import es.bq.devops.nomad.client.utils.Utils;

public class BaseJob {

    private String ID;
    private String Name;
    private String Type;
    private int Priority;
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

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getPriority() {
        return Priority;
    }

    public void setPriority(int priority) {
        Priority = priority;
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
