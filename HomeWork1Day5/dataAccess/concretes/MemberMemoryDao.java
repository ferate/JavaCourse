package concretes;

import java.util.ArrayList;

import abstracts.IMemberDao;

public class MemberMemoryDao implements IMemberDao{

	ArrayList<Member> members = new ArrayList<Member>();
	
	@Override
	public void save(Member member) {
		members.add(member);
		System.out.println(member.getFirstName()+" "+member.getLastName() + " Üyesi Baþarý Ýle Veritabanýna Eklendi");

	}

	@Override
	public Member listEmail(String email) {
		for(Member member : members) {
			if(member.getEmail() == email)
				return member;
		}
		return null;
	}

	@Override
	public Member checkMailPassword(String email, String password) {
		for(Member member : members) {
			if(member.getEmail() == email && member.getPassword() == password)
				return member;
		}
		return null;
	}

}
