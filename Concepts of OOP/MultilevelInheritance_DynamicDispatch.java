import java.util.*;

class Shape {
    public void area(int h, int l) {
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

public class MultilevelInheritance_DynamicDispatch {
   public static void main(String[] args){
      Shape scalene = new Triangle();
      scalene.area(5,3);
  }
}
