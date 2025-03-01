import java.util.*;

public class Palindrome{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = scanner.nextLine();
        
        StringBuilder rs = new StringBuilder(s);
        rs = rs.reverse();
        System.out.println("Reversed string: " + rs.toString());
        
        if (s.equals(rs.toString())){
          System.out.println("The given word is a Palindrome.");
        }
        else{
          System.out.println("The given word is not a Palindrome");
        }
        scanner.close();
    }
}
