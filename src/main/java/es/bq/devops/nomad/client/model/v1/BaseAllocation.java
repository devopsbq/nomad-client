package es.bq.devops.nomad.client.model.v1;

import es.bq.devops.nomad.client.utils.Utils;

public class BaseAllocation {
    private String ID;
    private String EvalID;
    private String Name;
    private String NodeID;
    private String JobID;
    private String TaskGroup;
    private String DesiredStatus;
    private String DesiredDescription;
    private String ClientStatus;
    private String ClientDescription;
    private long CreateIndex;
    private long ModifyIndex;

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getEvalID() {
        return EvalID;
    }

    public void setEvalID(String evalID) {
        EvalID = evalID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNodeID() {
        return NodeID;
    }

    public void setNodeID(String nodeID) {
        NodeID = nodeID;
    }

    public String getJobID() {
        return JobID;
    }

    public void setJobID(String jobID) {
        JobID = jobID;
    }

    public String getTaskGroup() {
        return TaskGroup;
    }

    public void setTaskGroup(String taskGroup) {
        TaskGroup = taskGroup;
    }

    public String getDesiredStatus() {
        return DesiredStatus;
    }

    public void setDesiredStatus(String desiredStatus) {
        DesiredStatus = desiredStatus;
    }

    public String getDesiredDescription() {
        return DesiredDescription;
    }

    public void setDesiredDescription(String desiredDescription) {
        DesiredDescription = desiredDescription;
    }

    public String getClientStatus() {
        return ClientStatus;
    }

    public void setClientStatus(String clientStatus) {
        ClientStatus = clientStatus;
    }

    public String getClientDescription() {
        return ClientDescription;
    }

    public void setClientDescription(String clientDescription) {
        ClientDescription = clientDescription;
    }

    public long getCreateIndex() {
        return CreateIndex;
    }

    public void setCreateIndex(long createIndex) {
        CreateIndex = createIndex;
    }

    public long getModifyIndex() {
        return ModifyIndex;
    }

    public void setModifyIndex(long modifyIndex) {
        ModifyIndex = modifyIndex;
    }

    @Override
    public String toString() {
        return Utils.toString(this);
    }
}
