import java.util.*;

class MethodOverload{
  MethodOverload(){
    System.out.println("Same method names diff paramaters");
  }
  
  int add(int a){
    return a;
  }
  
  int add(int a, int b){
    return a+b;
  }
}

public class OverloadingImplementation{
  public static void main(String[] args){
    MethodOverload case1 = new MethodOverload();
    int result = case1.add(2,3);
    System.out.println(result);
    MethodOverload case2 = new MethodOverload();
    int result2 = case2.add(6);
    System.out.println(result2);
  }
}
    