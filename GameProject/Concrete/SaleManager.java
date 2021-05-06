
public class SaleManager implements ISaleService {

	@Override
	public void add(Sale sale) {
		System.out.println(sale.getGamerId() + " IDli Kullanýcýya"+sale.getSalePrice()+" Fiyatý Ýle Satýþ Yapýldý");
		
	}
	
	public void add(Game game,Gamer gamer,Campaign campaign) {
		DiscountManager discountManager = new DiscountManager();
		double priceWithDiscount;
		priceWithDiscount=discountManager.discountCalculate(game.getPrice(),campaign.getDiscountRate());
		System.out.println(gamer.getFirstName() + "  Ýsimli Kullanýcýya "+priceWithDiscount+" TL Fiyatý Ýle KAMPANYALI Satýþ Yapýldý");
		
	}


	@Override
	public void update(Sale sale) {
		System.out.println(sale.getId() + " Satýþý Ýçin Güncelleme Yapýldý");
		
	}

	@Override
	public void delete(Sale sale) {
		System.out.println(sale.getId() + " Satýþý Baþarý Ýle Silindi");
		
	}

}
