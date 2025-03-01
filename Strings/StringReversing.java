import java.util.*;

public class StringReversing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = scanner.nextLine();
        
        System.out.print("Reversed String is ");
        for(int i = s.length()-1; i>=0; i--){
          System.out.print(s.charAt(i));
        }
        
        
        scanner.close();
    }
}
