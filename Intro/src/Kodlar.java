
public class Kodlar {

	
	//camelCase
			String internetSubeButonu  = "Ýnternet Þubesi";
			double dolarDun = 8.15; 
			double dolarBugun = 8.15;
			int vade = 36;
			boolean dustuMu = false;
			
			System.out.println(internetSubeButonu);
			
			if (dolarBugun<dolarDun) 
			{
				System.out.println("Dolar Düþtü Resmi");
			}
			else if(dolarBugun>dolarDun)
			{
				System.out.println("Dolar Yükseldi Resmi");
			}
			else
			{
				System.out.println("Dolar Eþit Resmi");
			}
			
			String kredi1 = "Hýzlý Kredi";
			String kredi2 = "Mutlu Emekli Kredisi";
			String kredi3 = "Konut Kredisi";
			String kredi4 = "Çitfçi Kredisi";
			String kredi5 = "MSB Kredisi";
			String kredi6 = "MEB Kredisi";
			
			System.out.println(kredi1);
			System.out.println(kredi2);
			System.out.println(kredi3);
			System.out.println(kredi4);
			System.out.println(kredi5);
			System.out.println("*********************");
			
		    String[] krediler = {"Hýzlý Kredi",
		    		             "Mutlu Emekli Kredisi",
		    		             "Konut Kredisi",
		    		             "Çitfçi Kredisi",
		    		             "MSB Kredisi",
		    		             "MEB Kredisi",
		    		             "Kültür Bakanlýðý Kredisi"
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
