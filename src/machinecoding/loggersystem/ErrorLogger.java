package machinecoding.loggersystem;

public class ErrorLogger extends Logger {
    public ErrorLogger(Logger nextLogger, int level) {
        super(nextLogger, level);
    }

    @Override
    public void print(String message) {
        System.out.println("error : " + message);
    }
}
