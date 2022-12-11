import java.util.Scanner;
import static java.lang.System.out;

class NochMehrDatenVerarbeiten {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        String vollerName;
        double betrag;
        boolean zuVersteuern;
        double summe;

        out.print("Vollst�ndiger Name des Kunden: ");
        vollerName = keyboard.nextLine();
        out.print("Betrag: ");
        betrag = keyboard.nextDouble();
        out.print("zzgl. MwSt. ('true' f�r ja, 'false' f�r nein)? ");
        zuVersteuern = keyboard.nextBoolean();

        if (zuVersteuern) {
            summe = betrag * 1.05;
        } else {
            summe = betrag;
        }

        out.println();
        out.print("Der Gesamtbetrag f�r ");
        out.print(vollerName);
        out.print(" bel�uft sich auf ");
        out.print(summe);
        out.println(".");

        keyboard.close();
    }
}
