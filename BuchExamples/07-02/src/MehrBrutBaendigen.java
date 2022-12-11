import java.util.Scanner;

class MehrBrutBaendigen {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int baerchen;
        int kinder;
        int baerchenJeKind;
      
        System.out.print
            ("Wie viele Gummibärchen? Wie viele Kinder? ");
         
        baerchen = keyboard.nextInt();      
        kinder = keyboard.nextInt();
      
        baerchenJeKind = baerchen / kinder;
      
        System.out.print("Jedes Kind bekommt ");
        System.out.print(baerchenJeKind);
        System.out.println(" Gummibärchen.");

        keyboard.close();
    }
}
