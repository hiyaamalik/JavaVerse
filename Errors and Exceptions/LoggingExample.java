import java.io.IOException;
import java.util.logging.*;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class LoggingExample {
    private static final Logger logger = Logger.getLogger(LoggingExample.class.getName());

    static {
        try {
            FileHandler handler = new FileHandler("error.log", true);
            handler.setFormatter(new SimpleFormatter());
            logger.addHandler(handler);
        } catch (IOException e) {
            System.out.println("Logging setup failed.");
        }
    }

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid Age: " + age);
        }
        System.out.println("Age is valid.");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (InvalidAgeException e) {
            logger.severe(e.getMessage());
        }
    }
}
