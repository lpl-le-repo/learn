import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class FreieZimmerAndersrum {

    public static void main(String args[])
        throws FileNotFoundException {
        
        Scanner diskScanner = 
            new Scanner(new File("belegung"));
        int gaesteIn[];
        gaesteIn = new int[10];

        for (int zimmernummer = 0; zimmernummer < 10; zimmernummer++) {
            gaesteIn[zimmernummer] = diskScanner.nextInt();
        }

        for (int zimmernummer = 9; zimmernummer >= 0; zimmernummer--) {
            if (gaesteIn[zimmernummer] == 0) {
                System.out.print("Zimmer ");
                System.out.print(zimmernummer);
                System.out.println(" ist frei.");
            }
        }

        diskScanner.close();
    }
}
