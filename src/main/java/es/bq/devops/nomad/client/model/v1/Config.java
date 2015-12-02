package es.bq.devops.nomad.client.model.v1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.bq.devops.nomad.client.utils.Utils;

public class Config {
    private String image;
    private List<Auth> auth;
    private List<Map<String, Long>> port_map;
    private List<Map<String, String>> labels;

    public Config() {
        this.port_map = new ArrayList<Map<String, Long>>();
        this.port_map.add(new HashMap<String, Long>());
        this.labels = new ArrayList<Map<String, String>>();
        this.labels.add(new HashMap<String, String>());
        this.auth = new ArrayList<Auth>();
    }

    public Config(String image) {
        this();
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Auth> getAuth() {
        return auth;
    }

    public void setAuth(List<Auth> auth) {
        this.auth = auth;
    }

    public List<Map<String, Long>> getPort_map() {
        return port_map;
    }

    public void setPort_map(List<Map<String, Long>> port_map) {
        this.port_map = port_map;
    }

    public void addPortMap(String label, long port) {
        this.port_map.get(0).put(label, port);
    }

    public List<Map<String, String>> getLabels() {
        return labels;
    }

    public void setLabels(List<Map<String, String>> labels) {
        this.labels = labels;
    }

    public void addLabel(String name, String value) {
        this.labels.get(0).put(name, value);
    }

    public void addLabels(Map<String, String> labels) {
        if (labels != null) {
            for (Map.Entry<String, String> entry : labels.entrySet()) {
                this.labels.get(0).put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void addAuth(Auth auth) {
        this.auth.add(auth);
    }

    @Override
    public String toString() {
        return Utils.toString(this);
    }
}
