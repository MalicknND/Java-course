package strings;


//// Concatenation
public class Example5 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        builder.append(" ");
        builder.append("World");
        builder.append("!");
        System.out.println(builder.toString());


        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello");
        buffer.append(" ");
        buffer.append("World");
        buffer.append("!");

        System.out.println(buffer.toString());
    }
}
