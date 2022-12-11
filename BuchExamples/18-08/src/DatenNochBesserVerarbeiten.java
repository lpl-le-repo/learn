import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

class DatenNochBesserVerarbeiten {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        keyboard.useLocale(Locale.US);
        
        double stueckPreis;
        int anzahl;
        boolean zuVersteuern;
        
        NumberFormat waehrung =
            NumberFormat.getCurrencyInstance(Locale.US);
       

        System.out.print("Stückpreis: ");
        stueckPreis = keyboard.nextDouble();
        System.out.print("Anzahl: ");
        anzahl = keyboard.nextInt();
        System.out.print("zzgl. MwSt. ('true' für ja, 'false' für nein)? ");
        zuVersteuern = keyboard.nextBoolean();
        
        double summe = stueckPreis * anzahl;
        if (zuVersteuern) {
            summe = summe * 1.05;
        }
        
        String summeFormatiert = waehrung.format(summe);
        System.out.print("Summe: ");
        System.out.println(summeFormatiert);

        keyboard.close();
    }
}
