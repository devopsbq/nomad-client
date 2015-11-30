package es.bq.devops.nomad.client.model.v1;

import java.util.List;

import es.bq.devops.nomad.client.utils.Utils;

public class NodeListEvaluation {
    private List<String> evalIDs;
    private Integer evalCreateIndex;
    private Integer nodeModifyIndex;

    public List<String> getEvalIDs() {
        return evalIDs;
    }

    public void setEvalIDs(List<String> evalIDs) {
        this.evalIDs = evalIDs;
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
