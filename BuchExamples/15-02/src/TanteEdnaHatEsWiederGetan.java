import static java.lang.System.out;

class TanteEdnaHatEsWiederGetan {

    public static void main(String args[]) {
        int anzahl;

        for (anzahl = 0; anzahl < 10; anzahl++) {
            out.print("Ich habe ");
            out.print(anzahl);
            out.println(" Mal gekaut.");
        }

        out.print(anzahl);
        out.println(" Mal gekaut. Es ist geschafft!");
        out.println("Endlich darf ich herunterschlucken.");
    }
}
