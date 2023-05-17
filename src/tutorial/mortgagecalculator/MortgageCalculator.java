package tutorial.mortgagecalculator;

import java.util.Scanner;
import java.text.NumberFormat;
public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner principalBalance = new Scanner(System.in);
        System.out.print("Principal: ");
        float principal = principalBalance.nextFloat();

        Scanner interestRate = new Scanner(System.in);
        System.out.print("Annual Interest Rate: ");
        float annualInterest = interestRate.nextFloat() / 100;
        float monthlyInterest = annualInterest / 12;

        Scanner period = new Scanner(System.in);
        System.out.print("Period (Years): ");
        byte years = period.nextByte();
        short months = (short) (years * 12);

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, months))
                / (Math.pow(1 + monthlyInterest, months) - 1) ;
        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));

    }
}
