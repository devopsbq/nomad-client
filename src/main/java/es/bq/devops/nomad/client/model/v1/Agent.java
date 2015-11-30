package es.bq.devops.nomad.client.model.v1;

import es.bq.devops.nomad.client.utils.Utils;

public class Agent {

    private AgentConfig config;
    private Member member;
    private Stats stats;

    public AgentConfig getConfig() {
        return config;
    }

    public void setConfig(AgentConfig config) {
        this.config = config;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    @Override
    public String toString() {
        return Utils.toString(this);
    }
}
