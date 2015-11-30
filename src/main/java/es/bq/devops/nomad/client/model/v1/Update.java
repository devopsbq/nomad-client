package es.bq.devops.nomad.client.model.v1;

import es.bq.devops.nomad.client.utils.Utils;

public class Update {
    private long Stagger;
    private int MaxParallel;

    public Update() {}

    public Update(long stagger, int maxParallel) {
        this.Stagger = stagger;
        this.MaxParallel = maxParallel;
    }

    public long getStagger() {
        return Stagger;
    }

    public void setStagger(long stagger) {
        Stagger = stagger;
    }

    public int getMaxParallel() {
        return MaxParallel;
    }

    public void setMaxParallel(int maxParallel) {
        MaxParallel = maxParallel;
    }

    @Override
    public String toString() {
        return Utils.toString(this);
    }

    public static Update Rolling() {
        return new Update(10000000000L, 1);
    }
}
