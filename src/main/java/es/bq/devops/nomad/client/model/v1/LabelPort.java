package es.bq.devops.nomad.client.model.v1;

import es.bq.devops.nomad.client.utils.Utils;

public class LabelPort {
    private String Label;
    private long Value;

    public LabelPort() {}

    public LabelPort(String label, long value) {
        this.Label = label;
        this.Value = value;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
    }

    public long getValue() {
        return Value;
    }

    public void setValue(long value) {
        Value = value;
    }

    @Override
    public String toString() {
        return Utils.toString(this);
    }
}
