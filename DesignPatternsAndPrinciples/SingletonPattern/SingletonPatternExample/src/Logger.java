public class Logger {
    private static Logger loggerInstance;

    private Logger(){
        System.out.println("Logger Constructer");
    }

    public static Logger getInstance(){
        if(loggerInstance==null){
            loggerInstance = new Logger();
        }
        return loggerInstance;
    }

    public void log(String msg){
        System.out.println(msg);
    }
}
