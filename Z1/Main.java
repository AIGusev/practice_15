package practice_15.Z1;

public class Main {
    static void main(String[] args) {

        ConfigurationManager configurationManager = ConfigurationManager.getInstance();

        System.out.println("Урл БД: " + configurationManager.getDataBaseUrl());
        System.out.println("Имя пользователя: " + configurationManager.getDataBaseUserName());
        System.out.println("Пароль: " + configurationManager.getDataBaseUserPassword());
        System.out.println("Путь к папке: " + configurationManager.getFileStoragePath());
        System.out.println("Уровень логирования: " + configurationManager.getLogLevel());
        System.out.println("Путь к логу: " + configurationManager.getLogFile());
    }
}
