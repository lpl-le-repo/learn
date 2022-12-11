import java.util.Scanner;
import static java.lang.System.out;

class MehrJetons {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        String antwort;
        int anzahlJetons;

        out.print("Wie viele Jetons haben Sie?");
        out.print(" Geben Sie eine Zahl oder");
        out.print(" 'Ich spiele nicht' ein. ");
        antwort = keyboard.nextLine();

        if (!antwort.equals("Ich spiele nicht")) {
            anzahlJetons = Integer.parseInt(antwort);
            anzahlJetons += 10;

            out.print("Nun haben Sie ");
            out.print(anzahlJetons);
            out.println(" Jetons.");
        }

        keyboard.close();
    }
}
