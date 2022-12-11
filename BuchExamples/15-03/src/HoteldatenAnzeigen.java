import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.System.out;

class HoteldatenAnzeigen {

   public static void main(String args[]) 
      throws FileNotFoundException {

      Scanner diskScanner = 
          new Scanner(new File("hoteldaten"));

      for (int stockwerk = 1; stockwerk <= 9; stockwerk++) {
         out.print("Stockwerk ");
         out.print(stockwerk);
         out.print(":  ");

         for (int zimmernummer = 1; zimmernummer <= 20; zimmernummer++) {
            out.print(diskScanner.nextInt());
            out.print(' ');
         }

         out.println();
      }

      diskScanner.close();
   }
}
