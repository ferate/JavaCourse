package abstracts;

import concretes.Member;

public interface IMemberDao {
	void save(Member member);
	Member listEmail(String email);
	Member checkMailPassword(String email,String password);

}
