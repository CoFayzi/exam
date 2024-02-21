package log;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class LogExample {
    public static void main(String[] args) {
        try {
            Logger logger = Logger.getLogger(LogExample.class.getName());

            FileHandler fileHandler = new FileHandler("example.log", true);
            fileHandler.setFormatter(new SimpleFormatter()); // Set a simple text formatter

            logger.addHandler(fileHandler);
            logger.setLevel(Level.FINE);

            logger.fine("This is log message");
            logger.info("This INFO log message");

            fileHandler.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
