import java.util.Scanner;

class Wechselstube {

   public static void main(String args[]) {
      Scanner keyboard = new Scanner(System.in);
      int zweieuro, euro, fuenfzigcent, zwanzigcent, zehncent, fuenfcent, zweicent, cent;
      int rest, summe;

      System.out.print("Wie viele Cent haben Sie? ");
      summe = keyboard.nextInt();

      zweieuro = summe / 200;
      rest = summe % 200;

      euro = rest / 100;
      rest = rest % 100;

      fuenfzigcent = rest / 50;
      rest = rest % 50;

      zwanzigcent = rest / 20;
      rest = rest % 20;

      zehncent = rest / 10;
      rest = rest % 10;

      fuenfcent = rest / 5;
      rest = rest % 5;

      zweicent = rest / 2;
      rest = rest % 2;

      cent = rest;

      System.out.println();
      System.out.println
            ("Sie bekommen " + summe + " Cent als:");
      System.out.println(zweieuro + " 2-Euro-M�nzen");
      System.out.println(euro + " 1-Euro-M�nzen");
      System.out.println(fuenfzigcent + " 50-Cent-M�nzen");
      System.out.println(zwanzigcent + " 20-Cent-M�nzen");
      System.out.println(zehncent + " 10-Cent-M�nzen");
      System.out.println(fuenfcent + " 5-Cent-M�nzen");
      System.out.println(zweicent + " 2-Cent-M�nzen");
      System.out.println(cent + " 1-Cent-M�nzen");

      keyboard.close();
   }
}
