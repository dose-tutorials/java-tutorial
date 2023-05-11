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
    }
}
