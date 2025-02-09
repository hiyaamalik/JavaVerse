import java.util.*;

interface CalcSquare{
  int calculate(int a);
}

public class SquareUsingInterface {
  public static int sq(int a){
    return a * a;
  }
  
  public static void main (String[] args){
    CalcSquare num = Square::sq;
    System.out.println(num.calculate(5));
  }
}