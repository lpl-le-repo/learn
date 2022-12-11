import java.util.Scanner;

class Eintrittskarte {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int alter;
        double preis = 0.00;

        System.out.print("Wie alt sind Sie?  ");
        alter = keyboard.nextInt();

        if (alter >= 12 && alter < 65) {
            preis = 9.25;
        }
        if (alter < 12 || alter >= 65) {
            preis = 5.25;
        }

        System.out.print("Ihr Eintrittspreis: ");
        System.out.print(preis);
        System.out.print(" EUR. ");
        System.out.println("Viel Spaﬂ in Ihrem Kino!");

        keyboard.close();
    }
}
