
public class DiscountManager implements IDiscountService {
	
	@Override
	public double discountCalculate(double price, double discountRate) {
		double priceWithDiscount = price-((price*discountRate)/100);
		return priceWithDiscount;
		
	}

}
