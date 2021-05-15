package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


// Lombok Kullanarak Otomatik Geter and Seter yazmak için
// classın başına @Data dedikten sonra Import demek yeterli

@Data

// Class'ın hangi katmana ait olduğunu bildirmek için kullanılan anotasyon
// @Entity dedikten sonra Import - javax.persistence seçerek ekliyoruz
@Entity
// Aşağıdaki anotasyon ile classın veritabanında hangi tabloya karşılık
// geldiğini gösteririz
@Table(name="products")
public class Product {
	// @Id ile hangi alanın PrimaryKey olduğunu bildirmiş oluyoruz.
	@Id
	// Id Alanının Veritabanı tarafında otomatik olarak ilerlediğini
	// bildirmiş oluyoruz. Yani Identity olduğunu
	@GeneratedValue
	// Veritabanındaki column karşılığını bildirmek için kullanırız
	@Column(name="product_id")
	private int id;
	
	@Column(name="category_id")
	private int categoryId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="units_in_stock")
	private short unitsInStock;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;
	
	
	public Product() {}
	
	public Product(int id, int categoryId, String productName, double unitPrice, short unitsInStock,
			String quantityPerUnit) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
		this.quantityPerUnit = quantityPerUnit;
	}
	

	
}
