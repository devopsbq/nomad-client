package es.bq.devops.nomad.client.model.v1;

import java.util.List;
import java.util.Map;

import es.bq.devops.nomad.client.utils.Utils;

public class Allocation extends BaseAllocation {

    public class Networks {
        private List<Network> Networks;

        public List<Network> getNetworks() {
            return Networks;
        }

        public void setNetworks(List<Network> networks) {
            Networks = networks;
        }
    }

    public class Events {
        private List<Event> Events;

        public List<Event> getEvents() {
            return Events;
        }

        public void setEvents(List<Event> events) {
            Events = events;
        }
    }

    private Job Job;
    private Resources Resources;
    private Map<String, Networks> TaskResources;
    private Map<String, Events> TaskStates;
    private Metrics Metrics;

    public Job getJob() {
        return Job;
    }

    public void setJob(Job job) {
        Job = job;
    }

    public Resources getResources() {
        return Resources;
    }

    public void setResources(Resources resources) {
        Resources = resources;
    }

    public Map<String, Networks> getTaskResources() {
        return TaskResources;
    }

    public void setTaskResources(Map<String, Networks> taskResources) {
        TaskResources = taskResources;
    }

    public Map<String, Events> getTaskStates() {
        return TaskStates;
    }

    public void setTaskStates(Map<String, Events> taskStates) {
        TaskStates = taskStates;
    }

    public Metrics getMetrics() {
        return Metrics;
    }

    public void setMetrics(Metrics metrics) {
        Metrics = metrics;
    }

    @Override
    public String toString() {
        return Utils.toString(this);
    }

}
