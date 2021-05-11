import abstracts.IMailService;
import concretes.Member;

public class GoogleMailApiAdapter implements IMailService {

	@Override
	public boolean CheckIfTrueMail(Member member) {
		 GoogleMailManager googleMailManager = new GoogleMailManager();
		 return googleMailManager.CheckIfTrueMail(member);
	}

}
