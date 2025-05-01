package dataType_Variables.scope;

public class Exemple3 {
    public  static int x = 5; // x has a global scope

    public static void main(String[] args) {
        System.out.println(x); // x can be acccessed here
    }

    public static void someMethod() {
        System.out.println(x); // x can also be accessed here
    }
}
