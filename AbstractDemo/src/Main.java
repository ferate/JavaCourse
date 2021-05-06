
public class Main {

	public static void main(String[] args) {
		CustomerManager customeranager = new CustomerManager();
		customeranager.databaseManager = new SqlServerDatabaseManager();
		customeranager.getCustomers();

		
	}

}
