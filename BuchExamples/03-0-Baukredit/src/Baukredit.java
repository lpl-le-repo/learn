import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;

public class Baukredit {

    public static void main(String args[]) throws IOException {

        BufferedReader keyboard =
            new BufferedReader(new InputStreamReader(System.in));
        double principal, rate, ratePercent;
        int years, n;
        final int paymentsPerYear = 12;
        double effectiveAnnualRate;
        double payment;
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        System.out.print("Wie hoch ist Ihre Kreditaufnahme?      ");
        principal = Double.parseDouble(keyboard.readLine().trim());
        System.out.print("Wie hoch ist der Zinssatz?             ");
        ratePercent = Double.parseDouble(keyboard.readLine().trim());
        rate = ratePercent / 100.00;
        System.out.print("Wie viele Jahre beträgt die Laufzeit?  ");
        years = Integer.parseInt(keyboard.readLine().trim());
        System.out.println("------------------------------");

        n = paymentsPerYear * years;
        effectiveAnnualRate = rate / paymentsPerYear;
        payment =
            principal
                * (effectiveAnnualRate
                    / (1 - Math.pow(1 + effectiveAnnualRate, -n)));
        System.out.print("Ihre monatliche Rate beträgt           ");
        System.out.println(currency.format(payment));
        System.out.println();
    }
}
