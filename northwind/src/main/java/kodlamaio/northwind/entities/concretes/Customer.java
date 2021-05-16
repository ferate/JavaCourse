package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="customers")
public class Customer {
	@Id
	@Column(name="customer_id")
	private String id;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="contact_name")
	private String contactName;
	
	@Column(name="contact_title")
	private String contactTitle;
	
	@Column(name="address")
	private String address;
	
	@Column(name="city")
	private String city;
	
	public Customer() {}
	
	public Customer(String id, String companyName, String contactName, String contactTitle, String address, String city) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.contactName = contactName;
		this.contactTitle = contactTitle;
		this.address = address;
		this.city = city;
	}

}
