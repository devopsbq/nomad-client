package es.bq.devops.nomad.client.model.v1;

import es.bq.devops.nomad.client.utils.Utils;

public class Evaluation {
    private String id;
    private Integer priority;
    private String type;
    private String triggeredBy;
    private String jobID;
    private Integer jobModifyIndex;
    private String nodeID;
    private Integer nodeModifyIndex;
    private String status;
    private String statusDescription;
    private Integer wait;
    private String nextEval;
    private String previousEval;
    private Integer createIndex;
    private Integer modifyIndex;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTriggeredBy() {
        return triggeredBy;
    }

    public void setTriggeredBy(String triggeredBy) {
        this.triggeredBy = triggeredBy;
    }

    public String getJobID() {
        return jobID;
    }

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    public Integer getJobModifyIndex() {
        return jobModifyIndex;
    }

    public void setJobModifyIndex(Integer jobModifyIndex) {
        this.jobModifyIndex = jobModifyIndex;
    }

    public String getNodeID() {
        return nodeID;
    }

    public void setNodeID(String nodeID) {
        this.nodeID = nodeID;
    }

    public Integer getNodeModifyIndex() {
        return nodeModifyIndex;
    }

    public void setNodeModifyIndex(Integer nodeModifyIndex) {
        this.nodeModifyIndex = nodeModifyIndex;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public Integer getWait() {
        return wait;
    }

    public void setWait(Integer wait) {
        this.wait = wait;
    }

    public String getNextEval() {
        return nextEval;
    }

    public void setNextEval(String nextEval) {
        this.nextEval = nextEval;
    }

    public String getPreviousEval() {
        return previousEval;
    }

    public void setPreviousEval(String previousEval) {
        this.previousEval = previousEval;
    }

    public Integer getCreateIndex() {
        return createIndex;
    }

    public void setCreateIndex(Integer createIndex) {
        this.createIndex = createIndex;
    }

    public Integer getModifyIndex() {
        return modifyIndex;
    }

    public void setModifyIndex(Integer modifyIndex) {
        this.modifyIndex = modifyIndex;
    }

    @Override
    public String toString() {
        return Utils.toString(this);
    }
}
