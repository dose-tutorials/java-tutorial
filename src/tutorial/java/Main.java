package tutorial.java;

import java.util.Date;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        int age = 30, temperature = 45; // variables can be declared in the same line with a comma

        int viewsCount = 123_456_789; // large ints can be separated by _ for more readability

        long subscribers = 3_123_456_789L; // longs needs to have L as suffix

        float price =10.99F; // floats need to have F as suffix

        char letter = 'A'; // single characters should be represented with single quotes

        boolean isEligible = false; // represents a boolean value

        System.out.println("Hello World");
        referenceTypes();
    }

    public static void referenceTypes() {
        Date now = new Date(); // the new keyword allocates memory to store the object
        System.out.println(now);

        Point point1 = new Point(1, 1); // this will allocate the point object in memory and hold de address
        Point point2 = point1; // it will only pass the address to the new variable
    }
    public static void strings() {

    }
}
