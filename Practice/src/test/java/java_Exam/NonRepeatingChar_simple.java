package java_Exam;

public class NonRepeatingChar_simple {
	public static void main(String[] args) {
		String s="kjhgvbftrd";
		char[] allchars = s.toCharArray();
		for (int i = 0; i < allchars.length; i++) {
			if (s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))) {
				System.out.println(s.charAt(i));
				break;
				
			}
		}
		
		
		
	}

}
