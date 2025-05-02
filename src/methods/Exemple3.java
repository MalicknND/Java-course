package methods;


// comment appeler une fonction en java
public class Exemple3 {
    public static void main(String[] args) {
        sayHello();
        sayHello("Malick");
    }
    public static void sayHello () {
        System.out.println("Hello World!");
    }

    public static void sayHello (String name) {
        System.out.println("Hello " + name);
    }
}
 