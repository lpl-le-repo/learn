import java.util.Random;

class GuteKontenVerarbeiten {
    
    public static void main(String args[]) {
        Random meinZufallswert = new Random();
        GutesKonto einKonto;
        double zinssatz;

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
            einKonto.zinsenAufschlagen(zinssatz, 3);

            einKonto.anzeigen();
            System.out.println();
        }
    }
} 
