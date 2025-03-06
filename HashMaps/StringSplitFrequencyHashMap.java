import java.util.*;

public class StringSplitFrequencyHashMap {
    public static void main(String[] args) {
      String string = new String();
      string = "apple banana apple orange banana apple";
      HashMap<String, Integer> hashmap = new HashMap<>();
      String[] words = string.split(" ");
      
      for(int i = 0; i< words.length; i++){
        if(hashmap.containsKey(words[i])){
          int value = hashmap.get(words[i])+1;
          hashmap.put(words[i], value);
        }
        else{
          hashmap.put(words[i], 1);
        }
        
      }
      
      System.out.println(hashmap);
      }
}