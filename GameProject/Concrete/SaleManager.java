
public class SaleManager implements ISaleService {

	@Override
	public void add(Sale sale) {
		System.out.println(sale.getGamerId() + " IDli Kullan�c�ya"+sale.getSalePrice()+" Fiyat� �le Sat�� Yap�ld�");
		
	}
	
	public void add(Game game,Gamer gamer,Campaign campaign) {
		DiscountManager discountManager = new DiscountManager();
		double priceWithDiscount;
		priceWithDiscount=discountManager.discountCalculate(game.getPrice(),campaign.getDiscountRate());
		System.out.println(gamer.getFirstName() + "  �simli Kullan�c�ya "+priceWithDiscount+" TL Fiyat� �le KAMPANYALI Sat�� Yap�ld�");
		
	}


	@Override
	public void update(Sale sale) {
		System.out.println(sale.getId() + " Sat��� ��in G�ncelleme Yap�ld�");
		
	}

	@Override
	public void delete(Sale sale) {
		System.out.println(sale.getId() + " Sat��� Ba�ar� �le Silindi");
		
	}

}
