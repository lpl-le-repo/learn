import java.util.Random;

class EintraeglicheKontenVerarbeiten {
    
    public static void main(String args[]) {
        Random meinZufallswert = new Random();
        EintraeglichesKonto einKonto;
        double zinssatz;

        for (int i = 0; i < 3; i++) {
            einKonto = new EintraeglichesKonto();

            einKonto.nachname = "" + 
                (char) (meinZufallswert.nextInt(26) + 'A') +
                (char) (meinZufallswert.nextInt(26) + 'a') +
                (char) (meinZufallswert.nextInt(26) + 'a');        
            einKonto.id = meinZufallswert.nextInt(10000);
            einKonto.saldo = meinZufallswert.nextInt(10000);

            einKonto.anzeigen();
            
            zinssatz = meinZufallswert.nextInt(5);
            einKonto.zinsenAufschlagen(zinssatz);

            einKonto.anzeigen();
            System.out.println();
        }
    }
} 
