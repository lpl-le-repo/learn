import java.util.Random;
import static java.lang.System.out;

class WuerfelnFuerAnfaenger {

    public static void main(String args[]) {
        Random myRandom = new Random();
        int wurf1 = 0, wurf2 = 0;

        while (wurf1 + wurf2 != 7 && wurf1 + wurf2 != 11) {
            wurf1 = myRandom.nextInt(6) + 1;
            wurf2 = myRandom.nextInt(6) + 1;

            out.print(wurf1);
            out.print(" ");
            out.println(wurf2);
        }

        out.print("Augenzahl: ");
        out.println(wurf1 + wurf2);
    }
}
