package LoggerExercise;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger instance;
    /**
     * @TODO Add any necessary fields and variables.
     */
    private String today = (new SimpleDateFormat("MMddyyyy")).format(new Date());
    private final String logFile="log"+today+".log";
    //private static Logger logger=null;
    private PrintWriter writer;

    /**
     * The constructor for SingletonLogger. Set all necessary fields.
     * This should be private; only singleton can instantiate this class!
     */
    //@TODO Add constructor here
    private Logger(){
        try{
            FileWriter fw=new FileWriter(logFile);
            writer= new PrintWriter(fw,true);
        } catch (IOException E){}
    }
    /**
     * @return A Logger instance of this class.
     * getInstance() is a static method; in other words, it is a CLASS method.
     * You need to use the class name to reference a static method.
     */
    public static Logger getInstance() {
        if(instance == null)
            instance = new Logger();
        return instance;
        //return null; //@TODO: Delete this line
    }


    /**
     *
     * @param log
     *            The Object that will be logged in the file.
     *            The Logger should logs information in a file with log[MonthDayYearOfToday].log (MMddyyyy) as file name in project root directory.
     */
    public void logInFile(Object log) {
        //@TODO: implement me
        writer.println(log);
    }
}