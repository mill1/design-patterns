
public class ChainPatternDemo {
	
   private static AbstractLogger getChainOfLoggers(){

      AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
      AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
      AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

      errorLogger.setNextLogger(fileLogger);
      fileLogger.setNextLogger(consoleLogger);
      //consoleLogger heeft geen nextLogger; daarom slechts één regel (eigen) output.

      return errorLogger;	
   }

   public static void main(String[] args) {
	   
      AbstractLogger loggerChain = getChainOfLoggers();

      loggerChain.logMessage(AbstractLogger.INFO, 
         "This is information.");

      loggerChain.logMessage(AbstractLogger.DEBUG, 
         "This is debug level information.");

      loggerChain.logMessage(AbstractLogger.ERROR, 
         "This is error information.");
   }
}
