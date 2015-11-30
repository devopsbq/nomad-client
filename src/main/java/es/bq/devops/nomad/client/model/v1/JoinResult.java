package es.bq.devops.nomad.client.model.v1;

import es.bq.devops.nomad.client.utils.Utils;

public class JoinResult {
    private Integer num_joined;
    private String error;

    public Integer getNum_joined() {
        return num_joined;
    }

    public void setNum_joined(Integer num_joined) {
        this.num_joined = num_joined;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return Utils.toString(this);
    }
}
