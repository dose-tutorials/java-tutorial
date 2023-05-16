package tutorial.java;

public class Mathematics {
    public static void main(String[] args) {
        int roundInt = Math.round(1.1F);
        System.out.println(roundInt);

        int ceilInt = (int)Math.ceil(1.1F);
        System.out.println(ceilInt);

        int floorInt = (int)Math.floor(1.1F);
        System.out.println(floorInt);

        int maxInt = Math.max(2, 4);
        System.out.println(maxInt);

        double randomDouble = Math.random();
        System.out.println(randomDouble);
    }
}
