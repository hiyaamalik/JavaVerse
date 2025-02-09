import java.util.*;

@FunctionalInterface
interface Calculator{
  int compute(int a, int b);
}

public class LambdaCalculator{
  public static void main(String[] args) {
    Calculator add = (a,b) -> a + b;
    Calculator sub = (a,b) -> a - b;
    Calculator mult = (a,b) -> a * b;
    Calculator div = (a,b) -> a/b;
    
    System.out.println("Addition " + add.compute(5,10));
    System.out.println("Subtraction " + sub.compute(10, 5));
    System.out.println("Multiplication " + mult.compute(10,5));
    System.out.println("Division " + div.compute(10,5));
  }
}
