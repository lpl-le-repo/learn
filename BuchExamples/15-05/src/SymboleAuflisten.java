import static java.lang.System.out;

class SymboleAuflisten {
  
  enum Symbol {
    kirsche, zitrone, kumquat, steckruebe
  }

  public static void main(String args[]) {
    for (Symbol scheibeLinks: Symbol.values()) {
      out.println(scheibeLinks);
    }
  }
}
