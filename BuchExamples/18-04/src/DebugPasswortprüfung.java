import java.util.Scanner;
import static java.lang.System.out;

class DebugPasswortpr�fung {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        String passwort = "schwertfisch";
        String benutzereingabe;

        out.print("Wie lautet das Passwort? ");
        benutzereingabe = keyboard.next();

        out.println();
        out.print("Ihre Eingabe:             ");
        out.println(benutzereingabe);
        out.print("Das Passwort lautet aber: ");
        out.println(passwort);
        out.println();

        if (passwort == benutzereingabe) {
            out.println("Sie d�rfen rein.");
        } else {
            out.println("Sie bleiben drau�en!");
        }

        keyboard.close();
    }
}
