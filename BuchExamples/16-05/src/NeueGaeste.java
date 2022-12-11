import java.util.Scanner;
import static java.lang.System.out;

class NeueGaeste {
    
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);        
        int welchesZimmer, anzahlGaeste;
        int gaesteIn[];
        gaesteIn = new int[10];

        for (int zimmernummer = 0; zimmernummer < 10; zimmernummer++) {
            gaesteIn[zimmernummer] = 0;
        }

        do {
            out.print("Zimmernummer: ");
            welchesZimmer = keyboard.nextInt();
            out.print("Wie viele Gäste? ");
            anzahlGaeste = keyboard.nextInt();
            gaesteIn[welchesZimmer] = anzahlGaeste;

            out.println();
            out.print("Noch jemand? ");
        } while (keyboard.
              findWithinHorizon(".",0).charAt(0) == 'J');

        out.println();
        out.println("Zimmer\tGäste");
        for (int zimmernummer = 0; zimmernummer < 10; zimmernummer++) {
            out.print(zimmernummer);
            out.print("\t");
            out.println(gaesteIn[zimmernummer]);
        }

        keyboard.close();
    }
}
