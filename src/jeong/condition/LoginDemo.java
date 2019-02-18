package jeong.condition;

public class LoginDemo {

	public static void main(String[] args) {
		String id = args[1];
		
		if (id.equals("jeong")) {
			System.out.println("Welcome " + id);
		} else {
			System.out.println("Fuck off " + id);
		}
		
	}

}
