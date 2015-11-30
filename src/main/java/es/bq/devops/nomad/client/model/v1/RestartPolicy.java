package es.bq.devops.nomad.client.model.v1;

public class RestartPolicy {
    private int Attemps;
    private long Interval;
    private long Delay;

    public RestartPolicy(int attemps, long interval, long delay) {
        this.Attemps = attemps;
        this.Interval = interval;
        this.Delay = delay;
    }

    public int getAttemps() {
        return Attemps;
    }

    public void setAttemps(int attemps) {
        Attemps = attemps;
    }

    public long getInterval() {
        return Interval;
    }

    public void setInterval(long interval) {
        Interval = interval;
    }

    public long getDelay() {
        return Delay;
    }

    public void setDelay(long delay) {
        Delay = delay;
    }

    public static RestartPolicy Default() {
        return new RestartPolicy(2, 600000000, 150000000);
    }
}
