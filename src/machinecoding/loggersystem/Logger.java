package machinecoding.loggersystem;

public abstract class Logger {
    Logger nextLogger;

    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    int level;

    public Logger(Logger nextLogger, int level) {
        this.level = level;
        this.nextLogger = nextLogger;
    }

    public void log(int level, String message) {
        if (level == this.level) {
            print(message);
            return;
        }
        nextLogger.log(level, message);
    }

    public abstract void print(String message);
}
