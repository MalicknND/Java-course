package arrays;

import java.util.Arrays;


public class Exemple3 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        // length methods
        System.out.println("The length of the array is : " + numbers.length);

        // sort methods
        int[] numbers2 = {5,2,1,4,3};
        Arrays.sort(numbers2);
        System.out.println("the sorted array is : " + Arrays.toString(numbers2));

        int searchKey = 4;
        int index = Arrays.binarySearch(numbers, searchKey);
        if (index >= 0) {
            System.out.println("The element found at index : " + index);
        } else {
            System.out.println("The element " + searchKey + " is not found at index : " + index);
        }
    }
}
