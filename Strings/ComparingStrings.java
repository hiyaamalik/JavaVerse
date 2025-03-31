import java.util.*;

public class ComparingStrings {
    public static void main(String[] args) {
      String s1 = "Hiyaa";
      String s2 = "hiyaa";
      String methodOne = (s1 == s2) ? "Same": "Not Same";
      System.out.println(methodOne);
      
      String s3 = new String ("Hiyaa");
      String s4 = new String ("hiyaa");
      String methodTwo = (s3.equals(s4)) ? "Same": "Not Same";
      System.out.println(methodTwo);
  }
}