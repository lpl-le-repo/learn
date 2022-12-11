/*
 * Dieser Code funktioniert nicht:
 */
import java.util.Scanner;
import static java.lang.System.out;

class PasswortpruefungFalsch {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        String passwort = "schwertfisch";
        String benutzereingabe;

        out.print("Wie lautet das Passwort? ");
        benutzereingabe = keyboard.next();

        if (passwort == benutzereingabe) {
            out.println("Sie dürfen rein.");
        } else {
            out.println("Sie bleiben draußen!");
        }

        keyboard.close();
    }
}
