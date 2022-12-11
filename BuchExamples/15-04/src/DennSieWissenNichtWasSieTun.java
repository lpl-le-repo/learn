/*
 * HAFTUNGSAUSSCHLUSS: Weder der Autor noch Wiley Publishing,
 * Inc., noch weitere Personen, und m�gen sie auch noch so entfernt
 * mit der Erstellung dieses Buches zu tun haben, sind f�r Sch�den
 * jeglicher Art haftbar, die sich aus der Verwendung dieses Codes 
 * oder von aus diesem Code abgeleiteten Werken einschlie�lich
 * solcher ergeben, die teilweise oder vollst�ndig durch den Leser
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
         ("  Datei 'wichtigeDaten' l�schen? ");
      antwort = 
         keyboard.findWithinHorizon(".", 0).charAt(0);

    } while (antwort != 'J' && antwort != 'N');

    if (antwort == 'J') {
      new File("wichtigeDaten.txt").delete();
      System.out.println("Gel�scht!");
    } else {
      System.out.println("Fragen kann nicht schaden!");
    }

    keyboard.close();
  }
}

