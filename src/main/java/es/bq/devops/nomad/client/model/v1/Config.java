package es.bq.devops.nomad.client.model.v1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.bq.devops.nomad.client.utils.Utils;

public class Config {
    private String image;
    private List<Auth> auth;
    private String network_mode;
    private String command;
    private List<String> args;
    private String hostname;
    private List<String> dns_search_domains;
    private List<Map<String, Long>> port_map;
    private List<Map<String, String>> labels;
    private String volume_driver;
    private List<Map<String, String>> volume_map;

    public Config() {
        this.port_map = new ArrayList<Map<String, Long>>();
        this.port_map.add(new HashMap<String, Long>());
        this.labels = new ArrayList<Map<String, String>>();
        this.labels.add(new HashMap<String, String>());
        this.auth = new ArrayList<Auth>();
        this.dns_search_domains = new ArrayList<String>();
        this.volume_map = new ArrayList<Map<String, String>>();
        this.volume_map.add(new HashMap<String, String>());
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

    public String getNetwork_mode() {
        return network_mode;
    }

    public void setNetwork_mode(String network_mode) {
        this.network_mode = network_mode;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public List<String> getArgs() {
        return args;
    }

    public void setArgs(List<String> args) {
        this.args = args;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public List<String> getDns_search_domains() {
        return dns_search_domains;
    }

    public void setDns_search_domains(List<String> dns_search_domains) {
        this.dns_search_domains = dns_search_domains;
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

    public String getVolume_driver() {
        return volume_driver;
    }

    public void setVolume_driver(String volume_driver) {
        this.volume_driver = volume_driver;
    }

    public List<Map<String, String>> getVolume_map() {
        return volume_map;
    }

    public void setVolume_map(List<Map<String, String>> volume_map) {
        this.volume_map = volume_map;
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

    public void addVolume(String mountpoint, String volume) {
        this.volume_map.get(0).put(mountpoint, volume);
    }

    public void addVolumes(Map<String, String> volumes) {
        if (volumes != null) {
            for (Map.Entry<String, String> volume : volumes.entrySet()) {
                this.volume_map.get(0).put(volume.getKey(), volume.getValue());
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
