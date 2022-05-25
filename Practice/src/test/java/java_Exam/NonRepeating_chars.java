package java_Exam;

import java.util.Scanner;

public class NonRepeating_chars {
	public static void main(String[] args) {
		String s="kjhg kjfg krfgyfkb";
		char[] allchars = s.toCharArray();
		for (int i = 0; i < allchars.length; i++) {
			char c = s.charAt(i);
			int count=0;
			for (int j = 0; j < allchars.length; j++) {
				if (c==allchars[j]) {
					count++;
					
				}
			}
			if (count==1) {
				System.out.println(c);
				
			}
			
		}
		
		
		
		
	}
	

}
