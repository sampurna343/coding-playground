package machinecoding.loggersystem;

public class DebugLogger extends Logger {
    public DebugLogger(Logger nextLogger, int level) {
        super(nextLogger, level);
    }

    @Override
    public void print(String message) {
        System.out.println("debug : " + message);
    }
}
