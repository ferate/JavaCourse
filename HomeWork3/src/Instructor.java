
public class Instructor extends User {
	String expertise;
	public Instructor(User user,String expertise, String lesson) {
		super();
		this.setId(user.getId());
		this.setFirstName(user.getFirstName());
		this.setLastName(user.getLastName());
		this.setEmail(user.getEmail());
		this.setPassword(user.getPassword());
		this.setMailAccept(user.getMailAccept());
		this.setConfidentialityAgreement(user.getConfidentialityAgreement());
		this.expertise = expertise;
		this.lesson = lesson;
	}

	String lesson;
	
	public Instructor() {
		
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	public String getLesson() {
		return lesson;
	}

	public void setLesson(String lesson) {
		this.lesson = lesson;
	}
	
}


