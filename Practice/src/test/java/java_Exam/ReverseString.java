package java_Exam;

public class ReverseString {
	public static void main(String[] args) {
		String str="nahdravoG";
		char[] allchars = str.toCharArray();
		for (int i = allchars.length-1; i >=0; i--) {
			System.out.print(allchars[i]);
			
		}
	}

}