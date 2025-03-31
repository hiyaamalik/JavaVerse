import java.util.*;

public class AgeUsingTernary {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int age = sc.nextInt();
      String result = (age>=18) ? "Adult" : "Not Adult" ;
      System.out.println(result);
      
  }
}