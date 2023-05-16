package tutorial.java;

import java.text.NumberFormat;
public class Formatting {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String currencyReturn = currency.format(1234567.891);
        System.out.println(currencyReturn);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String percentReturn = percent.format(0.5);
        System.out.println(percentReturn);
    }
}
