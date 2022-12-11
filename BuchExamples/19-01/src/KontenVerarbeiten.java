import java.util.Random;

class KontenVerarbeiten {
    
    public static void main(String args[]) {
            
        Random meinZufallswert = new Random();
        Konto einKonto;

        for (int i = 0; i < 3; i++) {
            einKonto = new Konto();

            einKonto.nachname = "" + 
                (char) (meinZufallswert.nextInt(26) + 'A') +
                (char) (meinZufallswert.nextInt(26) + 'a') +
                (char) (meinZufallswert.nextInt(26) + 'a');
                
            einKonto.id = meinZufallswert.nextInt(10000);
            einKonto.saldo = meinZufallswert.nextInt(10000);
            einKonto.anzeigen();
        }
    }
}
