import java.util.Scanner;
import static java.lang.System.out;

class DebugPasswortprüfung {

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
            out.println("Sie dürfen rein.");
        } else {
            out.println("Sie bleiben draußen!");
        }

        keyboard.close();
    }
}
