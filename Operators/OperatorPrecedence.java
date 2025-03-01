public class OperatorPrecedence {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 3, d = 2;

        int result = a + b * c - d;
        System.out.println("a + b * c - d = " + result);

        result = (a + b) * (c - d);
        System.out.println("(a + b) * (c - d) = " + result);

        result = a / b + c * d;
        System.out.println("a / b + c * d = " + result);

        result = a + (b - c) * d;
        System.out.println("a + (b - c) * d = " + result);
    }
}
