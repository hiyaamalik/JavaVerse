import java.util.*;

public class IfElse {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int num = scanner.nextInt();
      if (num%2 == 0){
        System.out.printf("The number %d is even", num);
      }
      else{
        System.out.printf("The number %d is odd", num);
      }
      scanner.close();
  }
}
