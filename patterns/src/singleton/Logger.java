package singleton;

public class Logger {
    private static final Logger logger = new Logger();

    private Logger() {}

    public static Logger getInstance() {
        return logger;
    }

    public <T> void printClassName(Class<T> c) {
        System.out.println(c.getName());
    }
}
