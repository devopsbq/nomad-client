package es.bq.devops.nomad.client.model.v1;

import es.bq.devops.nomad.client.utils.Utils;

public class Constraint {
    private boolean Hard;
    private String LTarget;
    private String RTarget;
    private String Operand;
    private int Weight;

    public boolean isHard() {
        return Hard;
    }

    public void setHard(boolean hard) {
        Hard = hard;
    }

    public String getLTarget() {
        return LTarget;
    }

    public void setLTarget(String lTarget) {
        LTarget = lTarget;
    }

    public String getRTarget() {
        return RTarget;
    }

    public void setRTarget(String rTarget) {
        RTarget = rTarget;
    }

    public String getOperand() {
        return Operand;
    }

    public void setOperand(String operand) {
        Operand = operand;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    @Override
    public String toString() {
        return Utils.toString(this);
    }
}
