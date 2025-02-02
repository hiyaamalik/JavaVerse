import java.util.*;

class ArithmeticOp {
    public int addition(int a, int b) {
        return a + b;
    }

    public int mult(int a, int b) {
        return a * b;
    }

    public int subt(int a, int b) {
        return a - b;
    }

    public int division(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }

    public int modulo(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Modulo by zero is not allowed.");
            return 0;
        }
        return a % b;
    }
}

class LogicalOp {
    public void logicop(int a, int b) {
        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println("Oh, Both are even numbers");
        } else if (a % 2 != 0 && b % 2 != 0) {
            System.out.println("Oh, Both numbers are odd");
        } else {
            System.out.println("Oh, one number is even, the other is odd");
        }
    }
}

class RelationalOp {
    public void relationop(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (a < b) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println("Both are equal");
        }
    }
}

public class Operators {
    public static void main(String[] args) {
        int a = 14;
        int b = 3;

        ArithmeticOp arith = new ArithmeticOp();
        System.out.println("Addition: " + arith.addition(a, b));
        System.out.println("Subtraction: " + arith.subt(a, b));
        System.out.println("Multiplication: " + arith.mult(a, b));
        System.out.println("Division: " + arith.division(a, b));
        System.out.println("Modulus: " + arith.modulo(a, b));

        LogicalOp log = new LogicalOp();
        log.logicop(a, b);

        RelationalOp rel = new RelationalOp();
        rel.relationop(a, b);
    }
}
