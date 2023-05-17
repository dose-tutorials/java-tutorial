package tutorial.java;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner inputAge = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = inputAge.nextByte();
        System.out.println("You are " + age);

        Scanner inputName = new Scanner(System.in);
        System.out.print("Name: ");
        String name = inputName.next();
        System.out.println(name);

        Scanner inputFullName = new Scanner(System.in);
        System.out.print("Full Name: ");
        String fullName = inputFullName.nextLine().trim();
        System.out.println(fullName);
    }
}
