import sun.jvm.hotspot.runtime.StaticBaseConstructor;

public class Main {

	public static void main(String[] args) {

		System.out.println("Program Çalýþtý");	
		System.out.println(Topla(5,4,3,2,1,9,8,7,653,856));

	}
	
	public static int Topla(int... sayilar) {
		int toplam=0;
		
		for (int sayi : sayilar) {
			toplam += sayi;			
		}
		
		return toplam;		
	}
	
}
 