package es.bq.devops.nomad.client.model.v1;

import java.util.List;
import java.util.Map;

import es.bq.devops.nomad.client.utils.Utils;

public class Job extends BaseJob {

    private static String SERVICE = "service";

    private String Region;
    private boolean AllAtOnce;
    private List<String> Datacenters;
    private List<Constraint> Constraints;
    private List<TaskGroup> TaskGroups;
    private Update Update;
    private Map<String, String> Meta;

    public Job() {
        this.setPriority(50);
        this.setType(SERVICE);
    }

    public Job(String id) {
        this();
        this.setID(id);
        this.setName(id);
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public boolean isAllAtOnce() {
        return AllAtOnce;
    }

    public void setAllAtOnce(boolean allAtOnce) {
        AllAtOnce = allAtOnce;
    }

    public List<String> getDatacenters() {
        return Datacenters;
    }

    public void setDatacenters(List<String> datacenters) {
        Datacenters = datacenters;
    }

    public List<Constraint> getContraints() {
        return Constraints;
    }

    public void setContraints(List<Constraint> contraints) {
        Constraints = contraints;
    }

    public List<TaskGroup> getTaskGroups() {
        return TaskGroups;
    }

    public void setTaskGroups(List<TaskGroup> taskGroups) {
        TaskGroups = taskGroups;
    }

    public Update getUpdate() {
        return Update;
    }

    public void setUpdate(Update update) {
        Update = update;
    }

    public Map<String, String> getMeta() {
        return Meta;
    }

    public void setMeta(Map<String, String> meta) {
        Meta = meta;
    }

    @Override
    public String toString() {
        return Utils.toString(this);
    }
}
