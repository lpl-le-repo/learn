class BrutBaendigenJaNein {

    public static void main(String args[]) {
        int baerchen;
        int kinder;
        int baerchenJeKind;
        boolean jedesKindBekommtZehn;

        baerchen = 140;
        kinder = 15;
        baerchenJeKind = baerchen / kinder;

        System.out.print("Wahr oder falsch? ");
        System.out.println("Jedes Kind bekommt 10 Gummibärchen.");
        jedesKindBekommtZehn = baerchenJeKind >= 10;
        System.out.println(jedesKindBekommtZehn);
    }
}
