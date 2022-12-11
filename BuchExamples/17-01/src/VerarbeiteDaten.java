import java.util.Scanner;

class VerarbeiteDaten {
    
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        double stueckPreis;
        int anzahl;
        boolean zuVersteuern;

        System.out.print("St�ckpreis: ");
        stueckPreis = keyboard.nextDouble();
        System.out.print("Anzahl: ");
        anzahl = keyboard.nextInt();
        System.out.print("zzgl. MwSt. ('true' f�r ja, 'false' f�r nein)? ");
        zuVersteuern = keyboard.nextBoolean();

        double summe = stueckPreis * anzahl;

        if (zuVersteuern) {
           summe = summe * 1.05;
        }
        
        System.out.print("Summe: ");
        System.out.println(summe);

        keyboard.close();
    }
}
