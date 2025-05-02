package dataType_Variables.methods;

public class Example8 {
    public static void main(String[] args) {
        int factorial0f5 = factorial(5);
        System.out.println("Factorial of 5 is: " + factorial0f5);
    }

    // Factorial of a number n is defined as n! = n * (n-1) * (n -2) * ... * 1
    public static int factorial(int n) {
        if(n == 0){
            return 1;
        }else {
            return n * factorial(n-1);
        }
    }
}
