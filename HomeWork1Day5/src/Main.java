import abstracts.IMemberVerificationService;
import concretes.Member;
import concretes.MemberManager;
import concretes.MemberMemoryDao;
import concretes.MemberVerificationManager;

public class Main {

	public static void main(String[] args) {
		MemberManager memberManager = new MemberManager(new MemberMemoryDao(),new MemberVerificationManager(),new GoogleMailApiAdapter());
		IMemberVerificationService userVerificationService = new MemberVerificationManager();
		Member member1 = new Member(1,"Ferat","EF�L","efilferat@gmail.com","12345678");
		Member member2 = new Member(2,"Bahad�r","EF�L","bahadirefil@gmail.com","abcdef123");//Bahad�r EF�L �yesi veri taban�na eklendi.
		Member member3 = new Member(3,"Onur","YAZAR","efilferat@gmail.com","12345678");//Bu mail adresi daha �nce kullan�lm��t�r.
		Member member4 = new Member(4,"V","KARA","vkara@gmail.com","123");//Ad ve Soyad Alan� 2 karakterden,Parolan�z 6 karakterden az olamaz.
		Member member5 = new Member(5,"Veysel","�LHAN","veysel@mail.com","987654321");//Mail adresiniz google taraf�ndan do�rulanamad�.
		System.out.println("");
		System.out.println("|____________<Veri Taban�>_____________|");
		System.out.println("|                                      |");
		memberManager.add(member1);
		memberManager.add(member2);
		memberManager.add(member3);
		memberManager.add(member4);
		memberManager.add(member5);
		System.out.println("");
		System.out.println("|__________<Hesap Do�rulama>___________|");
		System.out.println("|                                      |");
		userVerificationService.verificate(member1);
		userVerificationService.verificate(member2);
		userVerificationService.verificate(member5);
		System.out.println("");
		System.out.println("|____<Giri� ve Bilgilendirme Ekran�>___|");
		System.out.println("|                                      |");
		memberManager.login("efilferat@gmail.com","12345678");//Ferat EF�L kullan�c�s� i�in giri� ba�ar�l�.
		memberManager.login("","");//Giri� ba�ar�s�z email ve �ifre alan� bo� olamaz.
		memberManager.login("aaa","aa");//Hatal� giri� veya do�rulanmam�� mail adresi.
		memberManager.login("vkara@gmail.com", "123");

	}

}
