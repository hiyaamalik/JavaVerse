import java.util.*;

public class EmployeeHashmapOperations {
    public static void main(String[] args) {
      HashMap<Integer, String> employee = new HashMap<>();
      employee.put(101, "Alice");
      employee.put(102, "Jack");
      employee.put(103, "Emily");
      employee.put(104, "Gabriel");
      System.out.println("original hashmap");
      for (Integer id : employee.keySet()) {
            System.out.println("ID: " + id + ", Name: " + employee.get(id));
        }
      employee.put(102, "Gwen");
      System.out.println("Updated Hashmap");
      for(Integer id: employee.keySet()){
          System.out.println("ID: " + id + " Name: " + employee.get(id));
      }
      employee.remove(103);
      employee.remove(104);
      System.out.println("Updated List after Removing");
      for (Integer id : employee.keySet()){
          System.out.println("ID: " + id + "Name " + employee.get(id));
      }
      
  }
}