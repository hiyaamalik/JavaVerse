class FactorialException extends Exception {
    public FactorialException(String message) {
        super(message);
    }
}

public class FactorialExample {
    public static int factorial(int n) throws FactorialException {
        if (n < 0) throw new FactorialException("Number must be non-negative.");
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Factorial: " + factorial(-5));
        } catch (FactorialException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
