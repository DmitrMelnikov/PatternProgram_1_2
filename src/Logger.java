import java.time.LocalDateTime;

public class Logger {
    private static Logger logger;

    protected int num = 1;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public static String outTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        ;
        return String.valueOf(localDateTime.withNano(0)).replace('T', ' ');
    }

    public void log(String msg) {
        System.out.println("[" + num++ + "] " + msg);
    }
}