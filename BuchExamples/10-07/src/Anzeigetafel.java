import java.util.Scanner;
import static java.lang.System.out;

class Anzeigetafel {

    enum WerGewinnt {heim, gast, keiner}

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int hernewest, borussia;
        WerGewinnt wer;

        out.print("Tore von Herne-West und Borussia?  ");
        hernewest = keyboard.nextInt();
        borussia = keyboard.nextInt();
        out.println();
        
        if (hernewest > borussia) {
            wer = WerGewinnt.heim;
            out.println("Herne-West siegt. :-)");   
        } else if (borussia > hernewest) {
            wer = WerGewinnt.gast;
            out.println("Borussia gewinnt :-(");
        } else {
            wer = WerGewinnt.keiner;
            out.println("Unentschieden :-|");
        }
        
        out.println();
        out.println("Das heutige Spiel wurde Ihnen präsentiert von");
        out.println("Schrottsoft, der Nummer 1 in Sachen Software");
        out.println("in Herne. Schrottsoft spielt die Hauptrolle");
        out.println("in Kapitel 6.");
        out.println("Und nicht vergessen: Vier von fünf Ärzten");
        out.println("empfehlen ihren Patienten Schrottsoft!");    
        out.println();

        if (wer == WerGewinnt.heim) {
            out.println("Wir haben sie plattgemacht!");
        }

        if (wer == WerGewinnt.gast) {
            out.println("Der Schiri war doch bestochen!"); 
        }

        if (wer == WerGewinnt.keiner) {
            out.println("Wir sprechen uns wieder ..."); 
        }

        keyboard.close();
    }
}
