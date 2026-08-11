package machinecoding.loggersystem;

public class InfoLogger extends Logger {
    public InfoLogger(Logger nextLogger, int level) {
        super(nextLogger, level);
    }

    @Override
    public void print(String message) {
        System.out.println("info : " + message);
    }
}
