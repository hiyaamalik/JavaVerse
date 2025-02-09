class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        super("The age is below 18"); 
    }
}


public class AgeChecker {

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException(); // Correctly throwing an exception
        } else {
            System.out.println("Valid Age");
        }
    }
    

    public static void main(String[] args) {
        try {
            checkAge(19); 
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage()); 
        }
    }
}
