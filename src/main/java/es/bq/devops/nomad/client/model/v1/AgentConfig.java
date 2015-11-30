package es.bq.devops.nomad.client.model.v1;

import es.bq.devops.nomad.client.utils.Utils;

public class AgentConfig {
    private String Region;
    private String Datacenter;
    private String NodeName;
    private String DataDir;
    private String LogLevel;
    private String BindAddr;
    private boolean EnableDebug;
    private AgentPorts Ports;
    private AgentAddresses Addresses;
    private AgentAdvertiseAddrs AdvertiseAddrs;
    private Client Client;
    private Server Server;
    private Object Telemetry; // TODO
    private boolean LeaveOnInt;
    private boolean LeaveOnTerm;
    private boolean EnableSyslog;
    private String SyslogFacility;
    private boolean DisableUpdateCheck;
    private boolean DisableAnonymousSignature;
    private String Revision;
    private String Version;
    private String VersionPrerelease;
    private boolean DevMode;
    private AtlasConfig Atlas;

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getDatacenter() {
        return Datacenter;
    }

    public void setDatacenter(String datacenter) {
        Datacenter = datacenter;
    }

    public String getNodeName() {
        return NodeName;
    }

    public void setNodeName(String nodeName) {
        NodeName = nodeName;
    }

    public String getDatadir() {
        return DataDir;
    }

    public void setDatadir(String datadir) {
        DataDir = datadir;
    }

    public String getLogLevel() {
        return LogLevel;
    }

    public void setLogLevel(String logLevel) {
        LogLevel = logLevel;
    }

    public String getBindAddr() {
        return BindAddr;
    }

    public void setBindAddr(String bindAddr) {
        BindAddr = bindAddr;
    }

    public boolean isEnableDebug() {
        return EnableDebug;
    }

    public void setEnableDebug(boolean enableDebug) {
        EnableDebug = enableDebug;
    }

    public AgentPorts getPorts() {
        return Ports;
    }

    public void setPorts(AgentPorts ports) {
        Ports = ports;
    }

    public AgentAddresses getAddresses() {
        return Addresses;
    }

    public void setAddresses(AgentAddresses addresses) {
        Addresses = addresses;
    }

    public AgentAdvertiseAddrs getAdvertiseAddrs() {
        return AdvertiseAddrs;
    }

    public void setAdvertiseAddrs(AgentAdvertiseAddrs advertiseAddrs) {
        AdvertiseAddrs = advertiseAddrs;
    }

    public Client getClient() {
        return Client;
    }

    public void setClient(Client client) {
        Client = client;
    }

    public Server getServer() {
        return Server;
    }

    public void setServer(Server server) {
        Server = server;
    }

    public Object getTelemetry() {
        return Telemetry;
    }

    public void setTelemetry(Object telemetry) {
        Telemetry = telemetry;
    }

    public boolean isLeaveOnInt() {
        return LeaveOnInt;
    }

    public void setLeaveOnInt(boolean leaveOnInt) {
        LeaveOnInt = leaveOnInt;
    }

    public boolean isLeaveOnTerm() {
        return LeaveOnTerm;
    }

    public void setLeaveOnTerm(boolean leaveOnTerm) {
        LeaveOnTerm = leaveOnTerm;
    }

    public boolean isEnableSyslog() {
        return EnableSyslog;
    }

    public void setEnableSyslog(boolean enableSyslog) {
        EnableSyslog = enableSyslog;
    }

    public String getSyslogFacility() {
        return SyslogFacility;
    }

    public void setSyslogFacility(String syslogFacility) {
        SyslogFacility = syslogFacility;
    }

    public boolean isDisableUpdateCheck() {
        return DisableUpdateCheck;
    }

    public void setDisableUpdateCheck(boolean disableUpdateCheck) {
        DisableUpdateCheck = disableUpdateCheck;
    }

    public boolean isDisableAnonymousSignature() {
        return DisableAnonymousSignature;
    }

    public void setDisableAnonymousSignature(boolean disableAnonymousSignature) {
        DisableAnonymousSignature = disableAnonymousSignature;
    }

    public String getRevision() {
        return Revision;
    }

    public void setRevision(String revision) {
        Revision = revision;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }

    public String getVersionPrerelease() {
        return VersionPrerelease;
    }

    public void setVersionPrerelease(String versionPrerelease) {
        VersionPrerelease = versionPrerelease;
    }

    public boolean isDevMode() {
        return DevMode;
    }

    public void setDevMode(boolean devMode) {
        DevMode = devMode;
    }

    public AtlasConfig getAtlas() {
        return Atlas;
    }

    public void setAtlas(AtlasConfig atlas) {
        Atlas = atlas;
    }

    @Override
    public String toString() {
        return Utils.toString(this);
    }
}
