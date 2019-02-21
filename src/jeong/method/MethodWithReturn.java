package jeong.method;

public class MethodWithReturn {
	public static String numbering(int start, int end) {
		String output = "";
		
		int i = start;
		while (i < end) {
			output += i;
			i++;
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		System.out.println(numbering(1, 5));
	}

}
