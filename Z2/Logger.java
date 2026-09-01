package practice_15.Z2;

public class Logger {

    private static final Logger INSTANCE = new Logger();

    private Logger () {};

    public static Logger getInstance() {
        return INSTANCE;
    }

    void info(String message) {
        System.out.println("INFO: " + message);
    }

    void error(String message) {
        System.out.println("ERROR: " + message);
    }

    void warning(String message) {
        System.out.println("WARNING: " + message);
    }
}
