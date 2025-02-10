package shapes;

public class Rectangle implements Shape {
    private double length, width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implement area() method
    @Override
    public double area() {
        return length * width;
    }

    // Implement perimeter() method
    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}
