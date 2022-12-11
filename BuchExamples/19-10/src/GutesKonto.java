import java.text.NumberFormat;
import static java.lang.System.out;

class GutesKonto {
    String nachname;
    int id;
    double saldo;

    double zinssatzAbrufen(double zins) {
        double zinsen;
        
        out.print("Es werden Zinsen in Höhe von ");  
        out.print(zins);
        out.println(" Prozent aufgeschlagen.");
        
        zinsen = saldo * (zins / 100.0);
        return zinsen;
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
