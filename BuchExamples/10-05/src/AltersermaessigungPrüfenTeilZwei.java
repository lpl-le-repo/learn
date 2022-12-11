import java.util.Scanner;

class AltersermaessigungPrüfenTeilZwei {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int alter;
        double preis = 0.00;
        char antwort;

        System.out.print("Wie alt sind Sie?  ");
        alter = keyboard.nextInt();

        System.out.print("Haben Sie einen Gutschein (J/N)? ");
        antwort = keyboard.findWithinHorizon(".", 0).charAt(0);

        if (alter >= 12 && alter < 65) {
            preis = 9.25;
            if (antwort == 'J' || antwort == 'j') {
                preis -= 2.00;
            }
        } else {
            preis = 5.25;
        }

        System.out.print("Ihr Eintrittspreis: ");
        System.out.print(preis);
        System.out.print(". ");
        System.out.println("Viel Spaß in Ihrem Kino!");

        keyboard.close();
    }
}

