class KontenGekonnterVerarbeiten {
    
    public static void main(String args[]) {
        
        KontoGekonnter einKonto;

        for (int i = 0; i < 3; i++) {
            einKonto = new KontoGekonnter();
            einKonto.mitDatenBefuellen();
            einKonto.anzeigen();
        }
    }
}
