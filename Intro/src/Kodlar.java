
public class Kodlar {

	
	//camelCase
			String internetSubeButonu  = "�nternet �ubesi";
			double dolarDun = 8.15; 
			double dolarBugun = 8.15;
			int vade = 36;
			boolean dustuMu = false;
			
			System.out.println(internetSubeButonu);
			
			if (dolarBugun<dolarDun) 
			{
				System.out.println("Dolar D��t� Resmi");
			}
			else if(dolarBugun>dolarDun)
			{
				System.out.println("Dolar Y�kseldi Resmi");
			}
			else
			{
				System.out.println("Dolar E�it Resmi");
			}
			
			String kredi1 = "H�zl� Kredi";
			String kredi2 = "Mutlu Emekli Kredisi";
			String kredi3 = "Konut Kredisi";
			String kredi4 = "�itf�i Kredisi";
			String kredi5 = "MSB Kredisi";
			String kredi6 = "MEB Kredisi";
			
			System.out.println(kredi1);
			System.out.println(kredi2);
			System.out.println(kredi3);
			System.out.println(kredi4);
			System.out.println(kredi5);
			System.out.println("*********************");
			
		    String[] krediler = {"H�zl� Kredi",
		    		             "Mutlu Emekli Kredisi",
		    		             "Konut Kredisi",
		    		             "�itf�i Kredisi",
		    		             "MSB Kredisi",
		    		             "MEB Kredisi",
		    		             "K�lt�r Bakanl��� Kredisi"
		    		             };
		    //foreach
		    for(String kredi:krediler) {
		    	System.out.println(kredi);	    	
		    }
			
		    System.out.println("----------------------------");
		    
		    for(int i=0;i<krediler.length;i++) {
		    	System.out.println(krediler[i]);
		    }

	
	
}
