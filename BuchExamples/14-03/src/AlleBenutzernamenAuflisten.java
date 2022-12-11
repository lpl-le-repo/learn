/*
 * Dieser Code funktioniert!
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

class AlleBenutzernamenAuflisten {
    
   public static void main(String args[]) 
                        throws FileNotFoundException {      
      
      Scanner diskScanner = 
         new Scanner(new File("email.txt"));
      PrintStream diskWriter = 
         new PrintStream("benutzernamen.txt"); 
      char symbol;

      while (diskScanner.hasNext()) {
         symbol = diskScanner.findWithinHorizon(".",0)
                                             .charAt(0);

         while (symbol != '@') {
            diskWriter.print(symbol);
            symbol = diskScanner.findWithinHorizon(".",0)
                                              .charAt(0);
         }

         diskScanner.nextLine();
         diskWriter.println();
      }

      diskScanner.close();
      diskWriter.close();
   }
}

