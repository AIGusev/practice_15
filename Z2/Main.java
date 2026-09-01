package practice_15.Z2;

public class Main {
    static void main(String[] args) {

        Logger logger = Logger.getInstance();

        Logger.getInstance().info("Информация");
        Logger.getInstance().error("Ошибка");
        Logger.getInstance().warning("Предупреждение");
    }
}
