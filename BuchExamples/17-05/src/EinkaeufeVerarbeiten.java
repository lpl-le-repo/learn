class EinkaeufeVerarbeiten {
    
   public static void main(String args[]) {
	  Einkauf einkauf1 = new Einkauf();
	  einkauf1.stueckPreis = 20.00;
	  einkauf1.anzahl = 3;
	  einkauf1.zuVersteuern = true;
	  
	  Einkauf einkauf2 = new Einkauf();
	  einkauf2.stueckPreis = 20.00;
	  einkauf2.anzahl = 3;
	  einkauf2.zuVersteuern = false;
	  
	  double einkauf1Summe = einkauf1.stueckPreis * einkauf1.anzahl;
 	  if (einkauf1.zuVersteuern) {
		  einkauf1Summe *= 1.05;
       } 
	  
	  double einkauf2Summe = einkauf2.stueckPreis * einkauf2.anzahl;
	  if (einkauf2.zuVersteuern) {
		  einkauf2Summe *= 1.05;
       } 
	    
	  
	  
     if (einkauf1Summe == einkauf2Summe) {
    	 System.out.println("Kein Unterschied.");
         } else {
        	 System.out.println("Diese Einkäufe haben unterschiedliche Endbeträge.");
         }

   }
}
