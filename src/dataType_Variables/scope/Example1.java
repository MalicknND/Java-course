package dataType_Variables.scope;

public class Example1 {
    public static void main(String[] args) {
        int x = 5; // x has a local scope within the main method
        System.out.println(x); // x can be accessed here
    }// x is destroyed here
}
