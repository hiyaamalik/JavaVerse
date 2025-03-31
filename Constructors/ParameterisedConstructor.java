import java.util.*;

class ParaC {
    ParaC(String name){
      System.out.println("Hi " + name);
      System.out.println("This will be executed when class is called but you need to declare the parameter");
    }
    
    void display(){
      System.out.println("You need to call this method!");
    }
    
  }

public class ParameterisedConstructor {
  public static void main(String[] args) {
    ParaC obj = new ParaC("Hiyaa");
    obj.display();
  }
}

