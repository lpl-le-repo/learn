import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.System.out;

public class BelegungFuerEinZimmerAnzeigen {

   public static void main(String args[]) 
                        throws FileNotFoundException {

      Scanner keyboard = new Scanner(System.in);
      Scanner diskScanner = 
            new Scanner(new File("belegung"));
      int welchesZimmer;

      out.print("Welches Zimmer? ");
      welchesZimmer = keyboard.nextInt();

      for (int zimmernummer = 0; 
            zimmernummer < welchesZimmer; zimmernummer++){ 

         diskScanner.nextInt();
      }

      out.print("In Zimmer ");
      out.print(welchesZimmer);
      out.print(" wohnen gegenwärtig ");
      out.print(diskScanner.nextInt());
      out.println(" Gast/Gäste.");

      keyboard.close();
      diskScanner.close();
   }
}
