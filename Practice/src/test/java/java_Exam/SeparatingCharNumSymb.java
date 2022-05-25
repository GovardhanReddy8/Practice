package java_Exam;

public class SeparatingCharNumSymb {
	public static void main(String[] args) {
		String s="hg76k@gfj&$kjhf98!lfklbj)";
		char[] allchars = s.toCharArray();
		int alpha=0;
		int number=0;
		int symbol=0;
		for (int i = 0; i < allchars.length; i++) {
			if (Character.isAlphabetic(allchars[i])) {
				alpha++;	
			}else if (Character.isDigit(allchars[i])) {
				number++;
				
			}else {
				symbol++;
			}
			
		}
		
		System.out.println(alpha);
		System.out.println(number);
		System.out.println(symbol);
	}

}
