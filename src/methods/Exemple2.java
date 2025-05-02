package methods;

public class Exemple2 {
    public static void main(String[] args) {
       int sum = addNumbers(12, 12);
       System.out.println(sum);
    }

    public static int addNumbers( int a, int b) {
        int sum = a + b;
        return sum;
    }
}
