package practice_15.Z1;

public class ConfigurationManager {

    private static final ConfigurationManager INSTANCE = new ConfigurationManager();

    private String dataBaseUrl;
    private String dataBaseUserName;
    private String dataBaseUserPassword;
    private String fileStoragePath;
    private String logLevel;
    private String logFile;

    public String getDataBaseUrl() {
        return dataBaseUrl;
    }

    public String getDataBaseUserName() {
        return dataBaseUserName;
    }

    public String getDataBaseUserPassword() {
        return dataBaseUserPassword;
    }

    public String getFileStoragePath() {
        return fileStoragePath;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public String getLogFile() {
        return logFile;
    }

    private ConfigurationManager() {

        loadConfiguration();
    }
    public static ConfigurationManager getInstance() {
        return INSTANCE;
    }

    private void loadConfiguration() {
        dataBaseUrl = "url";
        dataBaseUserName = "admin";
        dataBaseUserPassword = "1234";
        fileStoragePath = "C:/file";
        logLevel = "INFO";
        logFile = "C:/file/log";
    }
}
