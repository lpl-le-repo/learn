/*
 * Dieser Code funktioniert NICHT, was mich jedoch nicht entmutigt.
 */
import java.util.Scanner;

class ErsterVersuch {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        char symbol = ' ';

        while (symbol != '@') {
            symbol = keyboard.findWithinHorizon(".",0).charAt(0);
            System.out.print(symbol);
        }

        System.out.println();

        keyboard.close();
    }
}
