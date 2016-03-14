package es.bq.devops.nomad.client.model.v1;

import java.util.List;

public class TaskState {

    public enum TaskSateType {
        PENDING("pending"), RUNNING("running"), DEAD("dead");

        private String name;

        private TaskSateType(final String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    private String State;
    private List<Event> Events;

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public List<Event> getEvents() {
        return Events;
    }

    public void setEvents(List<Event> events) {
        Events = events;
    }

}
