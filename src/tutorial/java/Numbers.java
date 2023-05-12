package tutorial.java;

import java.util.Arrays;

public class Numbers {
    public static void main(String[] args) {
        int[] numbers = new int[5]; // this statement declares an array, we need to specify the type of data and the length
        numbers[0] = 1; // will assign 1 to the first index
        System.out.println(Arrays.toString(numbers));

        int[] digits = {2, 3, 4, 1, 4, 7}; // this syntax will initialize the array if we know the items ahead of time
        Arrays.sort(digits); // will sort the array
        System.out.println(digits.length); // will print the length of the array
        System.out.println(Arrays.toString(digits)); // will print the array on the terminal

        int[][] multi_numbers = new int[2][3]; // declares a multidimensional array to add other dimension we can add a 3rd square brackets
        multi_numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(multi_numbers)); // deepToString will get every item in a multidimensional array

        int[][] multi_digits = {{1, 2, 3}, {2, 4, 6}}; // multidimensional arrays can be called by this syntax too

        // constants in java are declared with the  "final" keyword
        // constants should be named with capital letters
        final float PI = 3.14F;
    }
}
