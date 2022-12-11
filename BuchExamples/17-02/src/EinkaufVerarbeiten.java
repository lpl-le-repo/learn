import java.util.Scanner;

class EinkaufVerarbeiten {
    
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        Einkauf einEinkauf = new Einkauf();

        System.out.print("St�ckpreis: ");
        einEinkauf.stueckPreis = keyboard.nextDouble();
        System.out.print("Anzahl: ");
        einEinkauf.anzahl= keyboard.nextInt();
        
        System.out.print("zzgl. MwSt. ('true' f�r ja, 'false' f�r nein)?  ");
        einEinkauf.zuVersteuern = keyboard.nextBoolean();

        double summe = einEinkauf.stueckPreis * einEinkauf.anzahl;
        
        if (einEinkauf.zuVersteuern) {
        	summe = summe * 1.05;
        } 

        System.out.print("Summe: ");
        System.out.println(summe);

        keyboard.close();
    }
}
