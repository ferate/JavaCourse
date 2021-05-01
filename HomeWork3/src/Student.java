
public class Student extends User{
	String course;
	int courseCompletion;
	
	public Student() {
		
	}

	public Student(User user,String course, int courseCompletion) {
		super();
		this.setId(user.getId());
		this.setFirstName(user.getFirstName());
		this.setLastName(user.getLastName());
		this.setEmail(user.getEmail());
		this.setPassword(user.getPassword());
		this.setMailAccept(user.getMailAccept());
		this.setConfidentialityAgreement(user.getConfidentialityAgreement());
		this.course = course;
		this.courseCompletion = courseCompletion;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getCourseCompletion() {
		return courseCompletion;
	}

	public void setCourseCompletion(int courseCompletion) {
		this.courseCompletion = courseCompletion;
	}

}
