import java.text.NumberFormat;
import static java.lang.System.out;

class GutesKonto {
    String nachname;
    int id;
    double saldo;

    void zinsenAufschlagen(double zins, int jahre) {
    	for (int i=1; i <= jahre; i++) {
    		 out.print("Es werden Zinsen in H�he von ");  
    	     out.print(zins);
    	     out.println(" Prozent aufgeschlagen.");
    	        
    	     saldo += saldo * (zins / 100.0);
    	}
       
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
