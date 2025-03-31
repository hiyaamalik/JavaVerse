import java.util.*;

class DefC {
    DefC(){
      System.out.println("This will automatically be called when the class is called!");
    }
    
    void display(){
      System.out.println("You need to call this method!");
    }
    
  }

public class DefaultConstructor {
  public static void main(String[] args) {
    DefC obj = new DefC();
  }
}

