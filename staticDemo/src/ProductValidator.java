
public class ProductValidator {
	
	static {
		System.out.println("Static Yapýcý Blok Çalýþtý");
	}
	public ProductValidator() {
		System.out.println("Yapýcý Blok Çalýþtý");
	}
	
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void bisey() {}
	
	public static class BaskaBirClass {
		public static void Sil()
		{}
	}
	
	

}
