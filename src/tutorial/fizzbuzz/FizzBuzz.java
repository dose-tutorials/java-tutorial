package tutorial.fizzbuzz;

import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        System.out.print("Please input a number: ");
        Scanner inputNumber = new Scanner(System.in);
        int number = inputNumber.nextInt();

        if (number % 5 == 0 && number % 3 == 0){
            System.out.println("FizzBuzz");
        }
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 ==0)
            System.out.println("Buzz");
        else
            System.out.println(number);

    }
}
