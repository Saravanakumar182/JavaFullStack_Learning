public class Logger {
    private static volatile Logger loggerInstance;

    private Logger(){
        System.out.println("Logger Constructer");
    }

    public static Logger getInstance(){
        if(loggerInstance==null){
            synchronized(Logger.class){
                if(loggerInstance==null){
                    loggerInstance = new Logger();
                }
            }            
        }
        return loggerInstance;
    }

    public void log(String msg){
        System.out.println(msg);
    }
}
