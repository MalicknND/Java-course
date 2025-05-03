package strings;

// strong formatting
public class Exemple8 {
    public static void main(String[] args) {
        String name = "John Doe";
        int age = 18;
        String result = String.format("%s, %d", name, age);
        System.out.println(result);
        System.out.println(String.format("My name is %10s.", name));

        float price = 12.5f;
        System.out.println(String.format("%.2f", price));
    }
}
