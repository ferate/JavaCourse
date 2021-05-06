
import java.time.LocalDate;


public class Main {

	public static void main(String[] args)  {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		Customer customer = new Customer();		       	
		
		customer.dateOfBirth = LocalDate.of(1981,10,20);
		customer.firstName = "Ferat";
		customer.lastName = "EF�L";
		customer.nationalId = "11111111111";//Hatal� TC No
		
		customerManager.save(customer);			
      
		
	}

}
