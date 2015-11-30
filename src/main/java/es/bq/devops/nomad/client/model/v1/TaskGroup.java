package es.bq.devops.nomad.client.model.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import es.bq.devops.nomad.client.utils.Utils;

public class TaskGroup {
    private String Name;
    private int count;
    private List<Constraint> Constraints;
    private List<Task> Tasks;
    private RestartPolicy RestartPolicy;
    private Map<String, String> Meta;

    public TaskGroup() {
        this.Tasks = new ArrayList<Task>();
    }

    public TaskGroup(String name, int count) {
        this();
        this.Name = name;
        this.count = count;
        this.setRestartPolicy(RestartPolicy.Default());
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Constraint> getConstraints() {
        return Constraints;
    }

    public void setConstraints(List<Constraint> constraints) {
        Constraints = constraints;
    }

    public List<Task> getTasks() {
        return Tasks;
    }

    public void setTasks(List<Task> tasks) {
        Tasks = tasks;
    }

    public RestartPolicy getRestartPolicy() {
        return RestartPolicy;
    }

    public void setRestartPolicy(RestartPolicy restartPolicy) {
        RestartPolicy = restartPolicy;
    }

    public Map<String, String> getMeta() {
        return Meta;
    }

    public void setMeta(Map<String, String> meta) {
        Meta = meta;
    }

    public void addTask(Task task) {
        this.Tasks.add(task);
    }

    @Override
    public String toString() {
        return Utils.toString(this);
    }
}
