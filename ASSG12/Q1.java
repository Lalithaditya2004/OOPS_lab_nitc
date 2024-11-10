import java.util.*;

public class Q1{
    public static void main(String[] args) {
        Logger l = Logger.getInstance();
        l.setLogs(Logs.INFO);
        l.trace("This is a trace message");    
        l.debug("This is a debug message");    
        l.info("This is an info message");     
        l.warn("This is a warning message");
        l.error("This is an error message");   
        l.fatal("This is a fatal message");    

    }
}

enum Logs {
    TRACE, DEBUG, INFO, WARN, ERROR, FATAL
}

class Logger{
    private static Logger l = new Logger();
    private Logs clevel = Logs.INFO;
    private Logger(){
    }
    public static Logger getInstance(){
        return l;
    }
    public void setLogs(Logs level) {
        this.clevel = level;
    }

    
    private void log(Logs level, String message) {
        if (level.ordinal() >= clevel.ordinal()) {
            System.out.println("[" + level +"]: " + message);
        }
    }
    public void trace(String message) {
        log(Logs.TRACE, message);
    }
    
    public void debug(String message) {
        log(Logs.DEBUG, message);
    }

    public void info(String message) {
        log(Logs.INFO, message);
    }

    public void warn(String message) {
        log(Logs.WARN, message);
    }

    public void error(String message) {
        log(Logs.ERROR, message);
    }

    public void fatal(String message) {
        log(Logs.FATAL, message);
    }
}
