package methods;

public class Example4 {
    public static void main(String[] args) {
        addNumber(12, 12);
        int sum = sum(12, 12);
        System.out.println(sum);
        printMessage("Hello World");

    }

    public static void addNumber(int a, int b) {
        int sum = a + b;
        System.out.println("The sum is " + sum);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static int multiply(int a, int b) {
        int mult = a*b;
        return mult;
    }
}
