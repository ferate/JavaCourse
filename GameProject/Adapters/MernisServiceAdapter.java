import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements IGamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {		
			
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalId()),
					gamer.getFirstName().toUpperCase(),
					gamer.getLastName().toUpperCase(),
					gamer.getDateOfBirth().getYear());
			if(result)
			{
				System.out.println("Gamer-Mernis Doðrulama Ýþlemi Baþarýlý");
				return true;
			}
			else
			{
				System.out.println("Gamer-Mernis Doðrulama Ýþlemi Baþarýsýz");
				return false;
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}				
	}

}



