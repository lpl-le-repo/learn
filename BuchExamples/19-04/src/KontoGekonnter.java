import java.util.Random;
import java.text.NumberFormat;
import static java.lang.System.out;

class KontoGekonnter {
    String nachname;
    int id;
    double saldo;

    void mitDatenBefuellen() {
        Random meinZufallswert = new Random();
        
        nachname = "" + 
            (char) (meinZufallswert.nextInt(26) + 'A') +
            (char) (meinZufallswert.nextInt(26) + 'a') +
            (char) (meinZufallswert.nextInt(26) + 'a');
              
        id = meinZufallswert.nextInt(10000);
        saldo = meinZufallswert.nextInt(10000);
    }


    void anzeigen() {
        NumberFormat waehrung = 
            NumberFormat.getCurrencyInstance();
            
        out.print("Das Konto zum Nachnamen ");
        out.print(nachname);
        out.print(" und der ID ");
        out.print(id);
        out.print(" weist folgenden Saldo aus: ");
        out.println(waehrung.format(saldo));
    }
}
