import java.util.*;

public class TryCatchFinally{
  public static void main (String[] args){
    try{
      int a = 10;
      int b = 4;
      float c = a/b;
      System.out.println(c);
    } catch (Exception e) {
      System.out.println("Exception Caught- Not divisible by 0");
    } finally{
      System.out.println("This will be executed");}
  }
}
