
public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1, "Ferat", "EF�L", "efilferat@hotmail.com", "1234", true, true);
		
		User user2 = new User(2, "Engin", "Demiro�", "engin@gmail.com", "5467", true, true);
		
		User user3 = new User(3, "Kaya", "Karag�z", "kaya@gmail.com", "159", false, false);
		
		Instructor instructor = new Instructor(user2,"Yaz�l�m", "Java");
		
		Student student = new Student(user1, "Java", 15);	
		
		
		UserManager[] usersManager = new UserManager[] {new UserManager(),new StudentManager(),new InstructorManager()};
		
				
		for (UserManager userManager:usersManager) {
			userManager.add();
		}
		
		for (UserManager userManager:usersManager) {
			userManager.remove();
		}
		
		
		
	}

}
