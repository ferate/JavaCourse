package overriding;

public class BaseKrediManager {
	//public final double
	//şeklinde tanımlarsak overrid edilmez oluyor
	public double hesapla(double tutar) {
		return tutar*1.18;
	}
	
	
}
