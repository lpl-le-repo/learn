import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.System.out;

class BelegungAnzeigen {

    public static void main(String args[]) 
                         throws FileNotFoundException {
            
        Scanner diskScanner = 
            new Scanner(new File("belegung"));

        out.println("Zimmer\tGäste");

        for (int zimmernummer = 0; zimmernummer < 10; zimmernummer++) {
            out.print(zimmernummer);
            out.print("\t");
            out.println(diskScanner.nextInt());
        }

        diskScanner.close();
    }
}

