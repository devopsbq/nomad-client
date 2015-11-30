package es.bq.devops.nomad.client.model.v1;

import es.bq.devops.nomad.client.utils.Utils;

public class Metrics { // TODO
    private Integer nodesEvaluated;
    private Integer nodesFiltered;
    private Object classFiltered;
    private Object constraintFiltered;
    private Integer nodesExhausted;
    private Object classExhausted;
    private Object dimensionExhausted;
    private Object scores;
    private Integer allocationTime;
    private Integer coalescedFailures;

    public Integer getNodesEvaluated() {
        return nodesEvaluated;
    }

    public void setNodesEvaluated(Integer nodesEvaluated) {
        this.nodesEvaluated = nodesEvaluated;
    }

    public Integer getNodesFiltered() {
        return nodesFiltered;
    }

    public void setNodesFiltered(Integer nodesFiltered) {
        this.nodesFiltered = nodesFiltered;
    }

    public Object getClassFiltered() {
        return classFiltered;
    }

    public void setClassFiltered(Object classFiltered) {
        this.classFiltered = classFiltered;
    }

    public Object getConstraintFiltered() {
        return constraintFiltered;
    }

    public void setConstraintFiltered(Object constraintFiltered) {
        this.constraintFiltered = constraintFiltered;
    }

    public Integer getNodesExhausted() {
        return nodesExhausted;
    }

    public void setNodesExhausted(Integer nodesExhausted) {
        this.nodesExhausted = nodesExhausted;
    }

    public Object getClassExhausted() {
        return classExhausted;
    }

    public void setClassExhausted(Object classExhausted) {
        this.classExhausted = classExhausted;
    }

    public Object getDimensionExhausted() {
        return dimensionExhausted;
    }

    public void setDimensionExhausted(Object dimensionExhausted) {
        this.dimensionExhausted = dimensionExhausted;
    }

    public Object getScores() {
        return scores;
    }

    public void setScores(Object scores) {
        this.scores = scores;
    }

    public Integer getAllocationTime() {
        return allocationTime;
    }

    public void setAllocationTime(Integer allocationTime) {
        this.allocationTime = allocationTime;
    }

    public Integer getCoalescedFailures() {
        return coalescedFailures;
    }

    public void setCoalescedFailures(Integer coalescedFailures) {
        this.coalescedFailures = coalescedFailures;
    }

    @Override
    public String toString() {
        return Utils.toString(this);
    }
}
