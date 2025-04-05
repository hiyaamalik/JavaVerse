import java.util.*;

public class ImplementingLinkedList{
  public static void main(String[] args){
    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("mango");
    fruits.add("apple");
    fruits.add("orange");
    fruits.add("banana");
    fruits.add("cherry");
    
    // Traversal 
    for(String name:fruits){
      System.out.println(name);
    }
    //Add in beginning
    fruits.addFirst("plum");
    //Add in middle
    fruits.add(3,"kiwi");
    //Add Last
    fruits.addLast("guava");
    for(String name: fruits){
      System.out.println(name);
    }
    
    //checking 
    System.out.println(fruits.contains("A"));
    System.out.println(fruits.size());
    System.out.println(fruits.indexOf("banana"));
    
    //Removing first element 
    fruits.removeFirst();
    // Removing last element 
    fruits.removeLast();
    //Removing from value and indexOf
    fruits.remove("kiwi");
    fruits.remove(2);
    // Getting
    System.out.println(fruits.getFirst());
    System.out.println(fruits.getLast());
    
    for(String name: fruits){
      System.out.println(name);
    }
  }
}
