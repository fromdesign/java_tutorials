package jeong.method;

public class MethodDemo {
	public static void numbering (String j) {
		int i = 0;
		while (i < 10) {
			System.out.println(i + j);
			i++;
		}
	}
	public static void main(String[] args) {
		numbering("Fuck");
	}

}
