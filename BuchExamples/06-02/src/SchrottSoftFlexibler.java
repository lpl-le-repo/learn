import java.util.Scanner;

class SchrottSoftFlexibler {

   public static void main(String args[]) {
      Scanner keyboard = new Scanner(System.in);
      double betrag;

      System.out.print("Wie teuer ist ein USB-Stick? ");
      betrag = keyboard.nextDouble();
      betrag = betrag + 25.00;

      System.out.print("Wir werden Ihre Kreditkarte mit €");
      System.out.print(betrag);
      System.out.println(" belasten.");

      keyboard.close();
   }
}
