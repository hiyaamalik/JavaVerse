import java.util.*;

public class SortStrings{
  public static void main(String[] args) {
    List<String> words = Arrays.asList("Apple", "mango", "orange", "banana");
    words.sort((a,b)-> b.compareTo(a));
    System.out.println(words);
  }
}