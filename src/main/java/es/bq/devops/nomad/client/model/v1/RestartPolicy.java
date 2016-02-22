package es.bq.devops.nomad.client.model.v1;

public class RestartPolicy {

    public enum RestartMode {
        delay, fail
    }

    private int Attempts;
    private long Interval;
    private long Delay;
    private RestartMode Mode;

    public RestartPolicy(int attempts, long interval, long delay, RestartMode mode) {
        this.Attempts = attempts;
        this.Interval = interval;
        this.Delay = delay;
        this.Mode = mode;
    }

    public int getAttempts() {
        return Attempts;
    }

    public void setAttempts(int attempts) {
        Attempts = attempts;
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

    public RestartMode getMode() {
        return Mode;
    }

    public void setMode(RestartMode mode) {
        Mode = mode;
    }

    public static RestartPolicy Default() {
        return new RestartPolicy(2, 600000000, 150000000, RestartMode.delay);
    }
}
