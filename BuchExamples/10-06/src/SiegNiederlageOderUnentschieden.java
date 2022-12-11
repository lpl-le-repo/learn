import java.util.Scanner;
import static java.lang.System.out;

class SiegNiederlageOderUnentschieden {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int hernewest, borussia;

        out.print("Tore von Herne-West und Borussia?  ");
        hernewest = keyboard.nextInt();
        borussia = keyboard.nextInt();
        out.println();

        if (hernewest >borussia) {
            out.println("Herne-West siegt...");
            out.print("Herne-West: ");
            out.println(hernewest);
            out.print("Borussia:   ");
            out.println(borussia);
        } else if (borussia > hernewest) {
            out.println("Borussia gewinnt...");
            out.print("Borussia:   ");
            out.println(borussia);
            out.print("Herne-West: ");
            out.println(hernewest);
        } else {
            out.println("Unentschieden...");
            out.print("Herne-West: ");
            out.println(hernewest);
            out.print("Borussia:   ");
            out.println(borussia);
        }

        keyboard.close();
    }
}
