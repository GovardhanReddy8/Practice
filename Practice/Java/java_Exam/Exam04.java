package java_Exam;

public class Exam04 {
	public static void main(String[] args) {
		String s1="ygt4 jhgf$ jbh7&*@ hg54#@!";
		
		char[] allchars = s1.toCharArray();
		int alpha=0;
		int digit=0;
		int space=0;
		int symble=0;
		for (int i = 0; i < allchars.length; i++) {
			if (Character.isAlphabetic(allchars[i])) {
				alpha++;
				
			}else if (Character.isDigit(allchars[i])) {
				digit++;
				
			}else if (Character.isSpace(allchars[i])) {
				space++;
				
			}else {
				symble++;
			}
		}
		System.out.println(alpha);
		System.out.println(digit);
		System.out.println(space);
		System.out.println(symble);
	}

}
