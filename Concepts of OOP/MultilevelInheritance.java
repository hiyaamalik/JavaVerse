import java.util.*;

class Shape {
    public void area() {
        System.out.println("Prints Area");
    }
}

class Triangle extends Shape {
  public void area (int h, int l) {
      System.out.println(0.5 * h * l);
  }
}

class EquilateralTriangle extends Shape {
  public void area (int h, int l){ 
      System.out.println(0.5 * h * l);
  }
}

public class MultilevelInheritance {
   public static void main(String[] args){
      Triangle scalene = new Triangle();
      scalene.area(5,3);
  }
}
