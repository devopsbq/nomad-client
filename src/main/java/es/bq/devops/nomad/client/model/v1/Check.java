package es.bq.devops.nomad.client.model.v1;

import es.bq.devops.nomad.client.utils.Utils;

public class Check {
    private String Id;
    private long Interval;
    private String Name;
    private String Path;
    private String Protocol;
    private String Script;
    private long Timeout;
    private String Type;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public long getInterval() {
        return Interval;
    }

    public void setInterval(long interval) {
        Interval = interval;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPath() {
        return Path;
    }

    public void setPath(String path) {
        Path = path;
    }

    public String getProtocol() {
        return Protocol;
    }

    public void setProtocol(String protocol) {
        Protocol = protocol;
    }

    public String getScript() {
        return Script;
    }

    public void setScript(String script) {
        Script = script;
    }

    public long getTimeout() {
        return Timeout;
    }

    public void setTimeout(long timeout) {
        Timeout = timeout;
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

    public static Check Default() {
        Check check = new Check();
        check.setInterval(0);
        check.setTimeout(2000000000);
        check.setType("tcp");
        return check;
    }
}
