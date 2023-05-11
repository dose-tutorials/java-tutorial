package tutorial.java;

import java.net.SocketOption;
import java.util.Date;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        int age = 30, temperature = 45; // variables can be declared in the same line with a comma

        int viewsCount = 123_456_789; // large ints can be separated by _ for more readability

        long subscribers = 3_123_456_789L; // longs needs to have L as suffix

        float price = 10.99F; // floats need to have F as suffix

        char letter = 'A'; // single characters should be represented with single quotes

        boolean isEligible = false; // represents a boolean value

        System.out.println("Hello World");
        referenceTypes();
        strings();
        escapeSequences();
    }
    public static void referenceTypes() {
        Date now = new Date(); // the new keyword allocates memory to store the object
        System.out.println(now);

        Point point1 = new Point(1, 1); // this will allocate the point object in memory and hold de address
        Point point2 = point1; // it will only pass the address to the new variable
    }
    public static void strings() {
        String message = new String("Hello World"); // Strings in java are reference types
        String messageShortHand = "Hello World"; // this is a shorthand to avoid call the new keyword

//        message.endsWith("!!"); checks if it ends with
//        message.startsWith("!!"); check if it starts with
//        message.length(); return the string length
//        message.indexOf("H"); returns the index of the first occurrence
//        message.replace("!", "*"); returns a new string with the specified character replaced
//        message.toLowerCase(); converts the string to lower case
//        message.toUpperCase(); converts the string to upper case
//        message.trim(); trim white spaces after and before the string
        System.out.println(messageShortHand);
    }
    public static void escapeSequences() {
        String sentence = "Hello \"Luis\""; // the \ character will escape special characters
        System.out.println(sentence);
        String path = "c:\\Windows\\..."; // will add \ to the string
        System.out.println(path);
        String newLine = "Hi\nI'm Luis"; // will insert a new line in the string
        System.out.println(newLine);
        String data = "Name\tAge\tGender"; // will a tab in the string
        System.out.print(data);
    }
}
