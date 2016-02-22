package es.bq.devops.nomad.client.model.v1;

public class LogConfig {

    private int MaxFiles;
    private int MaxFileSizeMB;

    public LogConfig(int maxFiles, int maxFileSizeMB) {
        this.MaxFiles = maxFiles;
        this.MaxFileSizeMB = maxFileSizeMB;
    }

    public int getMaxFiles() {
        return MaxFiles;
    }

    public void setMaxFiles(int maxFiles) {
        MaxFiles = maxFiles;
    }

    public int getMaxFileSizeMB() {
        return MaxFileSizeMB;
    }

    public void setMaxFileSizeMB(int maxFileSizeMB) {
        MaxFileSizeMB = maxFileSizeMB;
    }

    public static LogConfig Default() {
        return new LogConfig(10, 10);
    }
}
