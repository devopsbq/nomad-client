package es.bq.devops.nomad.client.model.v1;

import es.bq.devops.nomad.client.utils.Utils;

public class NodeEvaluation {
    private String evalID;
    private Integer evalCreateIndex;
    private Integer nodeModifyIndex;

    public String getEvalID() {
        return evalID;
    }

    public void setEvalID(String evalID) {
        this.evalID = evalID;
    }

    public Integer getEvalCreateIndex() {
        return evalCreateIndex;
    }

    public void setEvalCreateIndex(Integer evalCreateIndex) {
        this.evalCreateIndex = evalCreateIndex;
    }

    public Integer getNodeModifyIndex() {
        return nodeModifyIndex;
    }

    public void setNodeModifyIndex(Integer nodeModifyIndex) {
        this.nodeModifyIndex = nodeModifyIndex;
    }

    @Override
    public String toString() {
        return Utils.toString(this);
    }
}
