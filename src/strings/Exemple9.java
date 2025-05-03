package strings;

// String pool
public class Exemple9 {
    public static void main(String[] args) {
        /*String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1 == str2);



        String str3 = new String("Hello");
        String str4 = new String("Hello");
        System.out.println(str3 == str4);

         */
        String str1 = new String("Hello").intern();
        String str2 = "Hello";
        System.out.println(str1 == str2);
    }
    }

