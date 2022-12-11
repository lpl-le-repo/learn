import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

class SchreibeOK {

    public static void main(String args[]) 
        throws FileNotFoundException {

        PrintStream diskWriter = 
            new PrintStream(new File("bestaetigung.txt"));

        diskWriter.print  ('O');
        diskWriter.println('K');

        diskWriter.close();
    }
}
