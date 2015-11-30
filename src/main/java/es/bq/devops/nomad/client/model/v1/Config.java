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

    public Config() {
        this.port_map = new ArrayList<Map<String, Long>>();
        this.port_map.add(new HashMap<String, Long>());
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

    public void addAuth(Auth auth) {
        this.auth.add(auth);
    }

    @Override
    public String toString() {
        return Utils.toString(this);
    }
}
