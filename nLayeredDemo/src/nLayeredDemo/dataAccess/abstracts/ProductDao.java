package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {
	// ürün ekleme ,listeleme,güncelleme gibi kodlar yazarýz
	
	void add(Product product) ;
	void update(Product product);
	void delete(Product products);
	Product get(int id);
	List<Product> getAll();
	
	
	

}
