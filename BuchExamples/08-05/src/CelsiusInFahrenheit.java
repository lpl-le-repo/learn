import java.util.Scanner;

class CelsiusInFahrenheit {

  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);
    double celsius, fahrenheit;

    System.out.print("Geben Sie die Temperatur in °Celsius ein: ");
    celsius = keyboard.nextDouble();

    fahrenheit = 9.0 / 5.0 * celsius + 32.0;
  
    System.out.print("Zimmertemperatur? ");
    System.out.println(fahrenheit == 69.8);

    keyboard.close();
  }
}
