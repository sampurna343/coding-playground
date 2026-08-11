package machinecoding.loggersystem;

public class Main {
    public static void main(String[] args) {
        Logger errorLogger = new ErrorLogger(null, Logger.ERROR);
        Logger debugLogger = new DebugLogger(errorLogger, Logger.DEBUG);
        Logger infoLogger = new InfoLogger(debugLogger, Logger.INFO);

        Logger logger = infoLogger;

        logger.log(Logger.DEBUG,"ok");
        logger.log(Logger.ERROR,"ok");
        logger.log(Logger.INFO,"ok");
    }
}
