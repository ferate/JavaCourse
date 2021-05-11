package concretes;

import abstracts.IMailService;
import abstracts.IMemberDao;
import abstracts.IMemberService;
import abstracts.IMemberVerificationService;

public class MemberManager implements IMemberService {

	IMemberDao memberDao;
	IMemberVerificationService memberVerificationService;
	IMailService mailCheckService;
	
	public MemberManager(IMemberDao memberDao,IMemberVerificationService memberVerificationService,IMailService mailCheckService ) {
		super();
		this.memberDao = memberDao;
		this.memberVerificationService = memberVerificationService;
		this.mailCheckService = mailCheckService;
	}
	
	@Override
	public void add(Member member) {
		if(!checkIfMemberExists(member.getEmail())){
			System.out.println(member.getEmail()+"  mail adresi daha önce kullanılmıştır.");
			return;
		}
		
		if(!mailCheckService.CheckIfTrueMail(member)) {
			System.out.println(member.getEmail()+ " Mail adresiniz google tarafından doğrulanamadı");
			return;
		}
		
		if(!memberVerificationService.checkMember(member)) {
			System.out.println("Ad ve Soyad Alanı 2 karakterden,Parolanız 6 karakterden az olmamalıdır");
			return;
		}
		
		memberDao.save(member);
		memberVerificationService.sendEmail(member.getEmail());
		
	}
	@Override
	public void login(String email, String password) {
		if(!memberVerificationService.checkEmailPassword(email, password)) {
			System.out.println("Giriş Başarısız. Email ve Password Alanı Boş Olamaz");
			return;
		}
		
		Member loginMember= memberDao.checkMailPassword(email, password);
		if(loginMember != null && loginMember.isMemberVerification()) {
			System.out.println(loginMember.getFirstName() + " " + loginMember.getLastName() + " Kullanıcısı İçin Giriş Başarılı" );
		}else {
			System.out.println("Hatalı Giriş veya Doğrulanmamış Mail Adresi");
		}
		
	}
	
	
	
	private boolean checkIfMemberExists(String email) {
		return memberDao.listEmail(email) == null;
	}
	
	
}
