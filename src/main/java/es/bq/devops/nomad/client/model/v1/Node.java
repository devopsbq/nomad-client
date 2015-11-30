package es.bq.devops.nomad.client.model.v1;

import java.util.Map;

import es.bq.devops.nomad.client.utils.Utils;

public class Node extends BaseNode {
    private Map<String, String> Attributes;
    private Resources Resources;
    private Object Reserved; // TODO
    private Map<String, String> Links;
    private Map<String, String> Meta;

    public Map<String, String> getAttributes() {
        return Attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        Attributes = attributes;
    }

    public Resources getResources() {
        return Resources;
    }

    public void setResources(Resources resources) {
        Resources = resources;
    }

    public Object getReserved() {
        return Reserved;
    }

    public void setReserved(Object reserved) {
        Reserved = reserved;
    }

    public Map<String, String> getLinks() {
        return Links;
    }

    public void setLinks(Map<String, String> links) {
        Links = links;
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
