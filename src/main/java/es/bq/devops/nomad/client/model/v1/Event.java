package es.bq.devops.nomad.client.model.v1;

import es.bq.devops.nomad.client.utils.Utils;

public class Event {
    private String KillError;
    private String Message;
    private int Signal;
    private int ExitCode;
    private String DriverError;
    private long Time;
    private String Type;

    public String getKillError() {
        return KillError;
    }

    public void setKillError(String killError) {
        KillError = killError;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public int getSignal() {
        return Signal;
    }

    public void setSignal(int signal) {
        Signal = signal;
    }

    public int getExitCode() {
        return ExitCode;
    }

    public void setExitCode(int exitCode) {
        ExitCode = exitCode;
    }

    public String getDriverError() {
        return DriverError;
    }

    public void setDriverError(String driverError) {
        DriverError = driverError;
    }

    public long getTime() {
        return Time;
    }

    public void setTime(long time) {
        Time = time;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    @Override
    public String toString() {
        return Utils.toString(this);
    }
}
