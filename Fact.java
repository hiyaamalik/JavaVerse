import java.util.*;

class Factorial {
    public int calculateFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

public class Fact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        
        Factorial f = new Factorial();
        int fact = f.calculateFactorial(n);
        System.out.println("Factorial is: " + fact);
        
        scanner.close();
    }
}
