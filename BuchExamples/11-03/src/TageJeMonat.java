import java.util.Scanner;

class TageJeMonat {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int monat, anzahlTage = 0;
        boolean schaltjahr;

        System.out.print("Welchen Monat haben wir? ");
        monat = keyboard.nextInt();

        switch (monat) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            anzahlTage = 31;
            break;

        case 4:
        case 6:
        case 9:
        case 11:
            anzahlTage = 30;
            break;

        case 2:
            System.out.print("Haben wir ein Schaltjahr ('true' oder 'false')? ");
            schaltjahr = keyboard.nextBoolean();
            if (schaltjahr) {
               anzahlTage = 29;
            } else {
               anzahlTage = 28;
            }
        }

        System.out.print(anzahlTage);
        System.out.println(" Tage");

        keyboard.close();
    }
}
