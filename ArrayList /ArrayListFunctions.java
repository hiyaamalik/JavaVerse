import java.util.*;

public class ArrayListFunctions{
  public static void main(String[] args){
    ArrayList<String> names = new ArrayList<>();
    names.add("ALice");
    names.add("Emma");
    names.add("Betty");
    names.add("Dorry");
    names.add("Charlie");
    // Traversal 1
    for(String name:names){
      System.out.println(name);
    }
    //Traversal 2
    for(int i = 0; i<=names.size()-1; i++){
      System.out.println(names.get(i));
    }
    //Add at Index
    names.add(3,"Henry");
    for(String name: names){
      System.out.println(name);
    }
    // Removing
    names.remove(3);
    names.remove("Charlie");
    for(String name: names){
      System.out.println(name);
    }
    // Sorting
    Collections.sort(names);
    Collections.reverse(names);
    
    //size
    System.out.println(names.size());
    
    //Clearing all elements
    names.clear();
    System.out.println(names.size());
    
  }
}
