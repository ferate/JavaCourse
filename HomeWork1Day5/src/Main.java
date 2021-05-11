import abstracts.IMemberVerificationService;
import concretes.Member;
import concretes.MemberManager;
import concretes.MemberMemoryDao;
import concretes.MemberVerificationManager;

public class Main {

	public static void main(String[] args) {
		MemberManager memberManager = new MemberManager(new MemberMemoryDao(),new MemberVerificationManager(),new GoogleMailApiAdapter());
		IMemberVerificationService userVerificationService = new MemberVerificationManager();
		Member member1 = new Member(1,"Ferat","EFÝL","efilferat@gmail.com","12345678");
		Member member2 = new Member(2,"Bahadýr","EFÝL","bahadirefil@gmail.com","abcdef123");//Bahadýr EFÝL üyesi veri tabanýna eklendi.
		Member member3 = new Member(3,"Onur","YAZAR","efilferat@gmail.com","12345678");//Bu mail adresi daha önce kullanýlmýþtýr.
		Member member4 = new Member(4,"V","KARA","vkara@gmail.com","123");//Ad ve Soyad Alaný 2 karakterden,Parolanýz 6 karakterden az olamaz.
		Member member5 = new Member(5,"Veysel","ÝLHAN","veysel@mail.com","987654321");//Mail adresiniz google tarafýndan doðrulanamadý.
		System.out.println("");
		System.out.println("|____________<Veri Tabaný>_____________|");
		System.out.println("|                                      |");
		memberManager.add(member1);
		memberManager.add(member2);
		memberManager.add(member3);
		memberManager.add(member4);
		memberManager.add(member5);
		System.out.println("");
		System.out.println("|__________<Hesap Doðrulama>___________|");
		System.out.println("|                                      |");
		userVerificationService.verificate(member1);
		userVerificationService.verificate(member2);
		userVerificationService.verificate(member5);
		System.out.println("");
		System.out.println("|____<Giriþ ve Bilgilendirme Ekraný>___|");
		System.out.println("|                                      |");
		memberManager.login("efilferat@gmail.com","12345678");//Ferat EFÝL kullanýcýsý için giriþ baþarýlý.
		memberManager.login("","");//Giriþ baþarýsýz email ve þifre alaný boþ olamaz.
		memberManager.login("aaa","aa");//Hatalý giriþ veya doðrulanmamýþ mail adresi.
		memberManager.login("vkara@gmail.com", "123");

	}

}
