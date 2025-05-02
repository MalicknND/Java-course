package arrays;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        int [] integers =new int [5];
        System.out.println("Array of integer elements " + Arrays.toString(integers));

        double [] doubles =new double [2];
        System.out.println("Array of doube elements " + Arrays.toString(doubles));

        boolean [] booleans =new boolean [3];
        System.out.println("Array of boolean elements " +Arrays.toString(booleans));

        String [] strings =new String [4];
        System.out.println("Array of string elements " + Arrays.toString(strings));


        int[] numbers;
        numbers = new int [] {1,2,3,4,5};
        System.out.println("Array of integer elements " + Arrays.toString(numbers));
        System.out.println("The first number is " + numbers[0]);
        numbers[0] = 6;
        System.out.println("The second number is now " + numbers[0]);
        System.out.println("Array of integer elements " + Arrays.toString(numbers));
    }
}
