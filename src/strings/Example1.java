package strings;

public class Example1 {
    public static void main(String[] args) {
        String s1 = "Hello"; // stored in the string constant pool
        String s2 = "Hello"; // stored in the string constant pool
        String s3 = new String("Hello"); // stored in the heap memory
        String s4 = new String("Hello");  // stored in the heap memory
        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
    }
}
