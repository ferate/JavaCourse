package abstracts;

import concretes.Member;

public interface IMemberVerificationService {
	boolean checkIfEmailExist(String email);
	
	boolean checkFirstName(String firtsName);
	
	boolean checkLastName(String lastName);
	
	boolean checkPassword(String password);
	
	boolean checkMember(Member member);
	
	void sendEmail(String email);
	
	void verificate(Member member);
	
	boolean checkEmailPassword(String email,String password);

}
