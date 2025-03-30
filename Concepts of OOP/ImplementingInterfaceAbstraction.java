import java.util.*;

interface Animal{
  int eyes = 2;
  void walk();
}

class Horse implements Animal{
  Horse(){
    System.out.println("Horse is a mammal");
  }
  
  public void walk(){
    System.out.println("Horse walks on 4 legs");
  }
}

public class ImplementingInterfaceAbstraction{
  public static void main(String[] args){
      Horse pony = new Horse();
      pony.walk();
  }
}
