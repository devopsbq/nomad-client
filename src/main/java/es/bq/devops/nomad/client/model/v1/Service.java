package es.bq.devops.nomad.client.model.v1;

import java.util.List;

import es.bq.devops.nomad.client.utils.Utils;

public class Service {
    private String Id;
    private String Name;
    private String PortLabel;
    private List<String> Tags;
    private List<Check> Checks;

    public Service() {}

    public Service(String name, String portLabel, List<String> tags) {
        this.Name = name;
        this.PortLabel = portLabel;
        this.Tags = tags;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPortLabel() {
        return PortLabel;
    }

    public void setPortLabel(String portLabel) {
        PortLabel = portLabel;
    }

    public List<String> getTags() {
        return Tags;
    }

    public void setTags(List<String> tags) {
        Tags = tags;
    }

    public List<Check> getChecks() {
        return Checks;
    }

    public void setChecks(List<Check> checks) {
        Checks = checks;
    }

    @Override
    public String toString() {
        return Utils.toString(this);
    }
}
