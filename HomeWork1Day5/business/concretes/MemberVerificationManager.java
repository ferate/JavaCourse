package concretes;

import java.util.regex.Pattern;

import abstracts.IMemberVerificationService;
import utils.RunRules;

public class MemberVerificationManager implements IMemberVerificationService {

	public static final Pattern mailRegex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	
	@Override
	public boolean checkIfEmailExist(String email) {
		return mailRegex.matcher(email).find();
	}

	@Override
	public boolean checkFirstName(String firtsName) {
		if(firtsName.length()>=2) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean checkLastName(String lastName) {
		if(lastName.length()>=2) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean checkPassword(String password) {
		if(password.length()>=6) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean checkMember(Member member) {
		boolean result = RunRules.run(
				 checkFirstName(member.getFirstName()),
				 checkLastName(member.getLastName()),
				 checkPassword(member.getPassword()),
				 checkIfEmailExist(member.getEmail())
				 );
		 return result;
	}

	@Override
	public void sendEmail(String email) {
		System.out.println("Lütfen " + email +" adresinize yollanan doðrulama linkine týklayýnýz");
		
	}

	@Override
	public void verificate(Member member) {
		member.setMemberVerification(true);
		System.out.println(member.getEmail() + " Mail adresiniz baþarýyla doðrulandý, giriþ yapabilirsiniz.");
		
	}

	@Override
	public boolean checkEmailPassword(String email, String password) {
		if(email !="" && password!="") {
			return true;
		}else {
			return false;
		}
	}

}
