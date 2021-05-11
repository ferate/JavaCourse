//package googleMailApi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import concretes.Member;

public class GoogleMailManager {
	public boolean CheckIfTrueMail(Member member) {
		Pattern pattern = Pattern.compile("@gmail.com", Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(member.getEmail());
	    return matcher.find();
	}
}