import java.util.Random;

class SiebzehnUndVier {

    public static void main(String args[]) {
        Random myRandom = new Random();
        int karte, summe = 0;

        System.out.println("Karte    Summe");

        while (summe < 21) {
            karte = myRandom.nextInt(10) + 1;
            summe += karte;

            System.out.print(karte);
            System.out.print("       ");
            System.out.println(summe);
        }

        if (summe == 21) {
            System.out.println("Du gewinnst! :-)");
        } else {
            System.out.println("Du verlierst! :-(");
        }
    }
}
