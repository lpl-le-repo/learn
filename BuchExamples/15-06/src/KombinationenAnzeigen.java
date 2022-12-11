import static java.lang.System.out;

class KombinationenAnzeigen { 

    enum Symbol {
        kirsche, zitrone, kumquat, steckruebe
    }

    public static void main(String args[]) {
        
        for (Symbol scheibeLinks: Symbol.values()) {
            for (Symbol scheibeMitte : Symbol.values()) {
                for (Symbol scheibeRechts : Symbol.values()) {
                    out.print(scheibeLinks);
                    out.print(" ");
                    out.print(scheibeMitte);
                    out.print(" ");
                    out.println(scheibeRechts);
                }
            }
        }
    }
}
