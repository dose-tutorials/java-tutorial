package tutorial.java;

public class Arithmetics {
    public static void main(String[] args) {
        int addition = 10 + 3;
        int subtractions = 10 - 3;
        int multiplication = 2 * 4;

        // arithmetics operations between two whole numbers will always return a whole number
        int division = 10 / 3;

        // we need to type cast to the type we want to return
        double doubleDivision = (double)10 / (double)3;

        int x = 1;
//        x++; // will return  x + 1
//        ++x; // will return x + 1 also

        // x++ will run x first and then add 1
        // ++x will add first and then run x

        int y = x++; // y value will be 1
        System.out.println(y);
        int z = ++x; // z value will be 3
        System.out.println(z);

        casting();
    }

    public static void casting() {
        // Implicit casting
        // when we convert from a data type a data type that
        // is bigger automatic or implicit casting is taking place
        // byte > short > int > long > float > double
        short x = 1;
        int y = x + 2; // x will be automatically cast to an int
        System.out.println(y);

        // Explicit casting
        double z = 1.1;
        int v = (int)z + 2;
        System.out.println(v);

        // Every primitive type have wrapper classes with several
        // utility functions
        String a = "1";
        // the wrapper classes integer have this method to convert
        // a string to an integer value type
        int b = Integer.parseInt(a);
//        Short.parseShort();
//        Long.parseLong();
//        Float.parseFloat();
        System.out.println(b);
    }
}
