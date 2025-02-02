import java.util.*;

public class Prime{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("number : ");
        int num = scanner.nextInt();
        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
            return; 
        }

        int i = 2;
        boolean isPrime = true;

        while (i < num) {  
            if (num % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        
        if (isPrime == false){
          System.out.println("It is not a prime number");
        }
        
        else {
          System.out.println("It is a prime number");
        }
        scanner.close();
    }
}
