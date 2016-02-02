package es.bq.devops.nomad.client.model.v1;

import es.bq.devops.nomad.client.utils.Utils;

public class Evaluation {
    private String ID;
    private Integer Priority;
    private String Type;
    private String TriggeredBy;
    private String JobID;
    private Integer JobModifyIndex;
    private String NodeID;
    private Integer NodeModifyIndex;
    private String Status;
    private String StatusDescription;
    private Integer Wait;
    private String NextEval;
    private String PreviousEval;
    private Integer CreateIndex;
    private Integer ModifyIndex;

    public String getID() {
        return ID;
    }


    public void setID(String iD) {
        ID = iD;
    }


    public Integer getPriority() {
        return Priority;
    }


    public void setPriority(Integer priority) {
        Priority = priority;
    }


    public String getType() {
        return Type;
    }


    public void setType(String type) {
        Type = type;
    }


    public String getTriggeredBy() {
        return TriggeredBy;
    }


    public void setTriggeredBy(String triggeredBy) {
        TriggeredBy = triggeredBy;
    }


    public String getJobID() {
        return JobID;
    }


    public void setJobID(String jobID) {
        JobID = jobID;
    }


    public Integer getJobModifyIndex() {
        return JobModifyIndex;
    }


    public void setJobModifyIndex(Integer jobModifyIndex) {
        JobModifyIndex = jobModifyIndex;
    }


    public String getNodeID() {
        return NodeID;
    }


    public void setNodeID(String nodeID) {
        NodeID = nodeID;
    }


    public Integer getNodeModifyIndex() {
        return NodeModifyIndex;
    }


    public void setNodeModifyIndex(Integer nodeModifyIndex) {
        NodeModifyIndex = nodeModifyIndex;
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


    public Integer getWait() {
        return Wait;
    }


    public void setWait(Integer wait) {
        Wait = wait;
    }


    public String getNextEval() {
        return NextEval;
    }


    public void setNextEval(String nextEval) {
        NextEval = nextEval;
    }


    public String getPreviousEval() {
        return PreviousEval;
    }


    public void setPreviousEval(String previousEval) {
        PreviousEval = previousEval;
    }


    public Integer getCreateIndex() {
        return CreateIndex;
    }


    public void setCreateIndex(Integer createIndex) {
        CreateIndex = createIndex;
    }


    public Integer getModifyIndex() {
        return ModifyIndex;
    }


    public void setModifyIndex(Integer modifyIndex) {
        ModifyIndex = modifyIndex;
    }


    @Override
    public String toString() {
        return Utils.toString(this);
    }
}
