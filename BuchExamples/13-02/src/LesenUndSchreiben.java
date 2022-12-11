import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

class LesenUndSchreiben {
    
    public static void main(String args[]) 
                         throws FileNotFoundException {

        Scanner diskScanner = 
            new Scanner(new File("rohdaten.txt"));
        PrintStream diskWriter = 
            new PrintStream("fertigdaten.txt"); 
        double grundpreis, produkt;
        int menge;

        grundpreis = diskScanner.nextDouble();
        menge = diskScanner.nextInt();

        produkt = grundpreis * menge;

        diskWriter.println(produkt);

        diskScanner.close();
        diskWriter.close();
    }
}
