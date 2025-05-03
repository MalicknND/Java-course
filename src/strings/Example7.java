package strings;

public class Example7 {
    public static void main(String[] args) {
        String str1 = "b";
        String str2 = "a";

        if (str1.compareTo(str2) == 0){
            System.out.println("str1 and str2 are the same");
        } else if (str1.compareTo(str2) > 0) {
            System.out.println("The str1 is greater than the str2");
        } else {
            System.out.println("The str1 is less than the str2");
        }
    }
}
