import java.util.Random;
import java.text.NumberFormat;

class GuteKontoVerarbeiten {
    
    public static void main(String args[]) {
        Random meinZufallswert = new Random();
        NumberFormat waehrung = 
            NumberFormat.getCurrencyInstance();
        GutesKonto einKonto;
        double zinssatz;
        double jahreszinsen;

        for (int i = 0; i < 3; i++) {
            einKonto = new GutesKonto();

            einKonto.nachname = "" + 
                (char) (meinZufallswert.nextInt(26) + 'A') +
                (char) (meinZufallswert.nextInt(26) + 'a') +
                (char) (meinZufallswert.nextInt(26) + 'a');        
            einKonto.id = meinZufallswert.nextInt(10000);
            einKonto.saldo = meinZufallswert.nextInt(10000);

            einKonto.anzeigen();

            zinssatz = meinZufallswert.nextInt(5);
            jahreszinsen = 
                einKonto.zinssatzAbrufen(zinssatz);

            System.out.print("Die Zinsen für dieses Jahr belaufen sich auf ");
            System.out.println
                (waehrung.format(jahreszinsen));
            System.out.println();
        }
    }
}
