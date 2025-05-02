package arrays;

import java.util.Arrays;

public class Exemple4 {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Matriz exempe" + Arrays.deepToString(matrix));
        System.out.println("Element of row = 1 & column = 1 is : " + matrix[1][1]);
        matrix[1][1] = 10;
        System.out.println("Matriz exempe now" + Arrays.deepToString(matrix));
    }
}
