package es.bq.devops.nomad.client.model.v1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import es.bq.devops.nomad.client.utils.Utils;

public class Task {
    private String Name;
    private String Driver;
    private Config Config;
    private List<Constraint> Constraints;
    private Resources Resources;
    private List<Service> Services;
    private Map<String, String> Env;
    private Map<String, String> Meta;

    public Task() {
        this.Services = new ArrayList<Service>();
        this.Env = new LinkedHashMap<String, String>();
    }

    public Task(String name, String driver) {
        this();
        this.Name = name;
        this.Driver = driver;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDriver() {
        return Driver;
    }

    public void setDriver(String driver) {
        Driver = driver;
    }

    public Config getConfig() {
        return Config;
    }

    public void setConfig(Config config) {
        Config = config;
    }

    public List<Constraint> getConstraints() {
        return Constraints;
    }

    public void setConstraints(List<Constraint> constraints) {
        Constraints = constraints;
    }

    public Resources getResources() {
        return Resources;
    }

    public void setResources(Resources resources) {
        Resources = resources;
    }

    public List<Service> getServices() {
        return Services;
    }

    public void setServices(List<Service> services) {
        Services = services;
    }

    public Map<String, String> getEnv() {
        return this.Env;
    }

    public void setEnv(Map<String, String> env) {
        if (env != null) {
            this.Env = env;
        }
    }

    public Map<String, String> getMeta() {
        return Meta;
    }

    public void setMeta(Map<String, String> meta) {
        Meta = meta;
    }

    public void addService(Service service) {
        this.Services.add(service);
    }

    public void addEnvVar(String name, String value) {
        this.Env.put(name, value);
    }

    public void addEnvs(Map<String, String> env) {
        if (env != null) {
            for (Entry<String, String> e : env.entrySet()) {
                this.Env.put(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public String toString() {
        return Utils.toString(this);
    }
}
