package tutorial.java;

public class ControlFlow {
    public static void main (String[] args) {
        int x = 1;
        int y = 2;

        System.out.println(x == y);
        System.out.println(x <= y);
        System.out.println(x >= y);
        System.out.println((x != y) + "\n");

        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm + "\n");

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible + "\n");

    }
}
