import java.time.LocalDate;

public class Gamer implements IEntity {
	private int id;
	private String nickName;
	private String nationalId;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	
	
	public Gamer() {
		
	}


	public Gamer(int id, String nickName, String nationalId,String firstName, String lastName, LocalDate dateOfBirth) {
		super();
		this.id = id;
		this.nickName = nickName;
		this.nationalId = nationalId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNickName() {
		return nickName;
	}


	public void setNickName(String nickName) {
		this.nickName = nickName;
	}


	public String getNationalId() {
		return nationalId;
	}


	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	
	
}
