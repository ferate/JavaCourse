package abstracts;

import concretes.Member;

public interface IMemberService {
	void add(Member member);
	void login(String email,String password);	

}
