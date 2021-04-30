package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);		
		System.out.println(product.getName());
		
		Product product2 = new Product(2,"PC", "Masaüstü Bilgisayar", 3500, 5, "Beyaz");
		
		System.out.println(product2.getName());
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);

	}

}
