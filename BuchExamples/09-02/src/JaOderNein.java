import java.util.Scanner;
import java.util.Random;

class JaOderNein {

  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);
    Random myRandom = new Random();
    int zufallszahl;

    System.out.print("Stelle deine Frage, mein Kind:  ");
    keyboard.nextLine();

    zufallszahl = myRandom.nextInt(10) + 1;

    if (zufallszahl > 5) {
      System.out.println("Klar. Ist doch selbstverst�ndlich.");
    } else {
      System.out.println("Nein. Was soll die bl�de Frage?");
    }

    keyboard.close();
  }
}
