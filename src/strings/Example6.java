package strings;

// String comparison
public class Example6 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        if (str1.equals(str2)){
            System.out.println("str1 and str2 are the same");
        } else {
            System.out.println("str1 and str2 are not the same");
        }


        if (str1.equalsIgnoreCase(str2)){
            System.out.println("str1 and str2 are the same");
        } else {
            System.out.println("str1 and str2 are not the same");
        }


    }
}
