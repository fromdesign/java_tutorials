package jeong.method;

public class MethodWithArguments {
	
	public static void numbering (int start, int end) {
		int i = start;
		while (i <= end) {
			System.out.println(i);
			i++;
		}
	}
	public static void main(String[] args) {
		numbering(3, 10);
	}

}
