import java.util.*;

interface Animal{
  int eyes = 2;
  void walk();
}

interface Herbivore{
  void eats();
}

class Horse implements Animal, Herbivore{
  Horse(){
    System.out.println("Horse is a mammal");
  }
  
  public void walk(){
    System.out.println("Horse walks on 4 legs");
  }
  
  public void eats(){
    System.out.println("Horse is a herbivore.");
  }
}

public class MultipleInheritanceUsingInterface{
  public static void main(String[] args){
      Horse pony = new Horse();
      pony.walk();
      pony.eats();
  }
}