import java.util.*;

public class CreatingEmployeeHashmap {
    public static void main(String[] args) {
      HashMap<Integer, String> employee = new HashMap<>();
      employee.put(101, "Alice");
      employee.put(102, "Jack");
      employee.put(103, "Emily");
      employee.put(104, "Gabriel");
      
      System.out.println(employee);
      
      for (Integer id : employee.keySet()) {
            System.out.println("ID: " + id + ", Name: " + employee.get(id));
        }
      
  }
}