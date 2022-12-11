/*
 * HAFTUNGSAUSSCHLUSS: Weder der Autor noch Wiley Publishing,
 * Inc., noch weitere Personen, und mögen sie auch noch so entfernt
 * mit der Erstellung dieses Buches zu tun haben, sind für Schäden
 * jeglicher Art haftbar, die sich aus der Verwendung dieses Codes 
 * oder von aus diesem Code abgeleiteten Werken einschließlich
 * solcher ergeben, die teilweise oder vollständig durch den Leser
 * erstellt wurden.  

 *
 * Unterschrift:_______________________________
 */

import java.io.File;
import java.util.Scanner;

class DennSieWissenNichtWasSieTun {

  public static void main(String args[]) {

    Scanner keyboard = new Scanner(System.in);
    char antwort;

    do {

      System.out.print("Bitte mit J oder N antworten...");
      System.out.print
         ("  Datei 'wichtigeDaten' löschen? ");
      antwort = 
         keyboard.findWithinHorizon(".", 0).charAt(0);

    } while (antwort != 'J' && antwort != 'N');

    if (antwort == 'J') {
      new File("wichtigeDaten.txt").delete();
      System.out.println("Gelöscht!");
    } else {
      System.out.println("Fragen kann nicht schaden!");
    }

    keyboard.close();
  }
}

