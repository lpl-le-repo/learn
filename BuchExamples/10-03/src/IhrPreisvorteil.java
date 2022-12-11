import java.util.Scanner;

class IhrPreisvorteil {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int alter;
        double preis = 0.00;
        char antwort;
        boolean istKind, istSenior, hatGutschein, hatKeinenGutschein;

        System.out.print("Wie alt sind Sie?  ");
        alter = keyboard.nextInt();

        System.out.print("Haben Sie einen Gutschein (J/N))? ");
        antwort = keyboard.findWithinHorizon(".", 0)
                                            .charAt(0);

        istKind = alter < 12;
        istSenior = alter >= 65;
        hatGutschein = antwort == 'J' || antwort == 'j';
        hatKeinenGutschein = antwort == 'N' || antwort == 'n';

        if (!istKind && !istSenior) {
            preis = 9.25;
        }
        if (istKind || istSenior) {
            preis = 5.25;
        }

        if (hatGutschein) {
            preis -= 2.00;
        }
        if (!hatGutschein && !hatKeinenGutschein) {
            System.out.println("Huh?");
        }

        System.out.print("Ihr Eintrittspreis: ");
        System.out.print(preis);
        System.out.print(" EUR. ");
        System.out.println("Viel Spaﬂ in Ihrem Kino!");

        keyboard.close();
    }
}

