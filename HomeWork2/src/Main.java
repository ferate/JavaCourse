
public class Main {

	public static void main(String[] args) {
				
		System.out.println("Program Çalıştı");

		User user1 = new User();
		user1.id = 1;
		user1.userName = "ferate";
		user1.firstName = "Ferat";
		user1.lastName = "EFİL";
		
		UserManager userManager1 = new UserManager();
		userManager1.addToUser(user1);
		
				
		User user2 = new User();
		user2.id = 2;
		user2.userName = "ali_b";
		user2.firstName = "Ali";
		user2.lastName = "KAYA";
		
		UserManager userManager2 = new UserManager();
		userManager2.addToUser(user2);
				
		User user3 = new User(3,"NazanA", "Nazan","ADALI");
		UserManager userManager3 = new UserManager();
		userManager3.addToUser(user3);
		
		Course course1 = new Course();
		course1.id = 1;
		course1.teacherId = 1;
		course1.name = "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)";		
		course1.price = 1500;
		
		CourseManager courseManager1 = new CourseManager();
		courseManager1.addToCourse(course1);
		
		Course course2 = new Course(2, 1, "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)", 2350);
		CourseManager courseManager2 = new CourseManager();
		courseManager2.addToCourse(course2);
		
		User[] users = new User[] {user1,user2,user3};
		
		System.out.println("Sistemde Kayıtlı "+users.length+ " Kullanıcı Bulunmaktadır");
		System.out.println("Bunlar:");
		for (User user : users) {
			System.out.println(user.id+"-"+user.userName+"-"+user.firstName+" "+user.lastName);			
		}
		
		System.out.println("-----------------------------------");
		
		Course[] courses = new Course[] {course1,course2};
		System.out.println("Sistemde Kayıtlı "+courses.length+ " Kurs Bulunmaktadır");
		System.out.println("Bunlar:");
		for (Course course : courses) {
			System.out.println(course.id+"-"+course.teacherId+"-"+course.name+"-"+course.price);			
		}
			
		
			
		
	}

}
