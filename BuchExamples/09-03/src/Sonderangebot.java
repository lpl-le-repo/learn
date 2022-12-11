import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

class Lokalrivalen {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(in);
        int hernewest, borussia;

        out.print("Tore von Herne-West und Borussia?  ");
        hernewest = keyboard.nextInt();
        borussia = keyboard.nextInt();
        out.println();

        if (hernewest > borussia) {
            out.print("Herne-West 04: ");
            out.println(hernewest);
            out.print("Borussia Lüdenscheid-Nord:   ");
            out.println(borussia);
        } else {
            out.print("Borussia Lüdenscheid-Nord:   ");
            out.println(borussia);
            out.print("Herne-West 04: ");
            out.println(hernewest);
        }

        keyboard.close();
    }
}
