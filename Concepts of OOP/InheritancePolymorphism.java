import java.util.*;

class Shape {
    public void area() {
        System.out.println("displays area");
    }
}

class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println(0.5 * b * h);
    }
}

class Circle extends Shape {
    public void area(double r) {
        System.out.println(3.14 * r * r);
    }
}

class Rectangle extends Shape {
    public int area(int l, int w) {
        return l * w;
    }
}

public class InheritancePolymorphism {
    public static void main(String[] args) {
      Rectangle square = new Rectangle();
      int printarea;
      printarea = square.area(5,5);
      System.out.println(printarea);
  }
}
