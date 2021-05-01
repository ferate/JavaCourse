
public class StudentManager extends UserManager {
	@Override
	public void add() {
		System.out.println("----------------------");
		System.out.println("Öðrenci Eklendi");
	}
	
	@Override
	public void remove() {
		System.out.println("----------------------");
		System.out.println("Öðrenci Silindi");		
	}

}
