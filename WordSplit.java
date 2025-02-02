import java.util.*;

public class WordSplit{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = scanner.nextLine();
        
        for (int i = 0 ; i<=s.length() - 1; i++){
          System.out.print(s.charAt(i));
          if (s.charAt(i) == ' ' || s.charAt(i) == '.' || s.charAt(i) == ',' || s.charAt(i) == '?' || s.charAt(i) == '!'){
            System.out.println("");
          }
        }
        scanner.close();
    }
}
