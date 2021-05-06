import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import java.rmi.RemoteException;

public class MernisServiceAdapter implements ICustomerCheckService {
	
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = false;
		
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(customer.nationalId),
					customer.firstName.toUpperCase(),
					customer.lastName.toUpperCase(), 
					customer.dateOfBirth.getYear()
					);		
			if(result) {
				System.out.println("Kimlik Doðrulama Baþarýlý");
				return result=true;
			}else {				
			    System.out.println("Kimlik Doðrulama Baþarýsýz");
			    return result=false;
			}
			
		} catch (RemoteException e) {			
			e.printStackTrace();
			return result=false;
		}
	}	
	

}
