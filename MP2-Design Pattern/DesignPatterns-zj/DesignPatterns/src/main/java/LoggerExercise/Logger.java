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

    /**
     * The constructor for SingletonLogger. Set all necessary fields.
     *
     */
    //@TODO Add constructor here
    private Logger() {}

    /**
     * @return A Logger instance of this class.
     */
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
        //return null; //@TODO: Delete this line
    }


    /**
     *
     * @param log
     *            The Object that will be logged in the file.
     */
    public void logInFile(Object log) {
        //@TODO: implement me
        String today = (new SimpleDateFormat("MMddyyyy")).format(new Date());
        String filename = "log"+today+".log";
        try {
            FileWriter myWriter = new FileWriter(filename, true);
            myWriter.write(log.toString()+"\n");
            myWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }       

    }
}