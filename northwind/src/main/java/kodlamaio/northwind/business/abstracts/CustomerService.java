package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.entities.concretes.Customer;

public interface CustomerService {
	List<Customer> getAll();

}
