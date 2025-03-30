import java.util.*;

public class IfElse {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int age = scanner.nextInt();
      if (age< 13){
        System.out.printf("Child");
      }
      else if (age > 19){
        System.out.printf("Adult");
      }
      else{
        System.out.printf("Teenager");
      }
      scanner.close();
  }
}