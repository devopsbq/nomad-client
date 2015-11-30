package es.bq.devops.nomad.client.model.v1;

import es.bq.devops.nomad.client.utils.Utils;

public class JobEvaluation {
    private String EvalID;
    private long EvalCreateIndex;
    private long JobModifyIndex;

    public String getEvalID() {
        return EvalID;
    }

    public void setEvalID(String evalID) {
        EvalID = evalID;
    }

    public long getEvalCreateIndex() {
        return EvalCreateIndex;
    }

    public void setEvalCreateIndex(long evalCreateIndex) {
        EvalCreateIndex = evalCreateIndex;
    }

    public long getJobModifyIndex() {
        return JobModifyIndex;
    }

    public void setJobModifyIndex(long jobModifyIndex) {
        JobModifyIndex = jobModifyIndex;
    }

    @Override
    public String toString() {
        return Utils.toString(this);
    }
}
