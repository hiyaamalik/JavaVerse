import java.util.*;

public class DoWhileLoop {
    public static void main(String[] args) {
      int sum= 0;
      int i = 0;
      do {
        sum = sum + i;
        i++;
        System.out.println(sum);
      } while (i<= 4);
      
  }
}