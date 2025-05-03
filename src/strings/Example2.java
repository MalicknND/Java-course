package strings;

public class Example2 {
    public static void main(String[] args) {
        String s = "Hello World";

        int length = s.length();
        System.out.println("The length of the string is: " + length);

        char ch = s.charAt(0);
        System.out.println("The first character of the string is: " + ch);

        int index = s.indexOf("W");
        System.out.println("The index of the string is: " + index);
    }
}
