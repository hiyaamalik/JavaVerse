import java.util.*;

public class FactUsingLoop {
    public static void main(String[] args) {
      int fact= 1;
      int i = 1;
      do {
        System.out.print( i + " * " + fact + " = ");
        fact = fact * i;
        i++;
        System.out.println(fact);
      } while (i<= 4);
      
  }
}
