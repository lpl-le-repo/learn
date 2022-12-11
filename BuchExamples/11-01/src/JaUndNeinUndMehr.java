import java.util.Scanner;
import java.util.Random;
import static java.lang.System.out;

class JaNeinUndMehr {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        Random myRandom = new Random();
        int zufallszahl;

        out.print("Stelle deine Frage, mein Kind:  ");
        keyboard.nextLine();

        zufallszahl = myRandom.nextInt(10) + 1;

        switch (zufallszahl) {
        case 1:
            out.println("Klar. Ist doch selbstverst�ndlich.");
            break;

        case 2:
            out.println("Nein. Was soll die bl�de Frage?");
            break;

        case 3:
            out.print("Mag sein, mag sein.");
            out.println(" Doch wer wei� das schon?");
            break;

        case 4:
            out.print("Welchen Teil von 'Nein'");
            out.println(" hast du nicht verstanden?");
            break;

        case 5:
            out.println("Keine Chance.");
            break;

        case 6:
            out.println("Ja, nee, is' klar.");
            break;

        case 7:
            out.print("M�glich. Aber nur,");
            out.println(" wenn du lieb bist.");
            break;

        case 8:
            out.println("Ja. Als wenn das wichtig w�re.");
            break;

        case 9:
            out.print("Nein, fr�hestens");
            out.println(" am St. Nimmerleinstag.");
            break;

        case 10:
            out.print("Aber ja, schon");
            out.println(" seit Olims Zeiten.");
            break;

        default:
            out.print("Mein Zufallszahlengenerator");
            out.print(" ist kaputt.");
            out.print("  Und du glaubst,");
            out.println(" du h�ttest Probleme!");
            break;
        }

        out.println("Bis dann.");

        keyboard.close();
    }
}