package java_Exam;

public class Exam03 {
	public static void main(String[] args) {
		String s1="hgfd vhgf jhgf ygfv";
		char[] allchars = s1.toCharArray();
		for (int i = 0; i < allchars.length; i++) {
			if (s1.indexOf(s1.charAt(i))==s1.lastIndexOf(s1.charAt(i))) {
				System.out.println(s1.charAt(i));
				
			}
		}
	}

}
