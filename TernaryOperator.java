public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int largest = (a > b) ? a : b;

        System.out.println("The larger number is: " + largest);

        int num = 15;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + result);
    }
}
