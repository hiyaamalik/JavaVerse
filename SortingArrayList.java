import java.util.*;

public class SortingArrayList {
    public static void main(String[] args) {
      ArrayList <Integer> numbers = new ArrayList<>(10);
      numbers.add(98);
      numbers.add(14);
      numbers.add(32);
      numbers.add(28);
      numbers.add(39);
      numbers.add(7);
      numbers.add(16);
      numbers.add(3);
      numbers.add(49);
      numbers.add(23);
      
      System.out.println(numbers);
      
      Collections.sort(numbers);
      
      System.out.println("Sorted List: " + numbers);
      
  }
}