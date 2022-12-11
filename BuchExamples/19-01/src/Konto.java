import java.text.NumberFormat;
import static java.lang.System.out;

class Konto {
    String nachname;
    int id;
    double saldo;

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

