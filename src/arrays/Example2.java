package arrays;

// interating through arrays using 'for' loop
public class Example2 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        // interating through arrays using 'for' loop
        for (int i = 0; i < numbers.length; i++) {
            //System.out.println(numbers[i]);
        }

        // interating through arrays using 'for each loop'
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
