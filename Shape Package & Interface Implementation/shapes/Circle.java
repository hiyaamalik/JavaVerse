package shapes;

public class Circle implements Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement area() method
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // Implement perimeter() method
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
