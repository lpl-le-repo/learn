import java.util.Scanner;

class ProduktBerechnen {
    
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        double grundpreis, produkt;
        int menge;

        grundpreis = keyboard.nextDouble();
        menge = keyboard.nextInt();

        produkt = grundpreis * menge;

        System.out.println(produkt);

        keyboard.close();
    }
}
