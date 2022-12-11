/*
 * Dieser Code funktioniert beinahe, es gibt 
 * nur noch einen winzig kleinen Fehler:
 */
import java.util.Scanner;

class ZweiterVersuch {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        char symbol = ' ';

        while (symbol != '@') {
            System.out.print(symbol);
            symbol = keyboard.findWithinHorizon(".",0).charAt(0);
        }

        System.out.println();

        keyboard.close();
    }
}

