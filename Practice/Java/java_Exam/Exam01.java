package java_Exam;

import java.util.Iterator;

public class Exam01 {
	public static void main(String[] args) {
		String s1="hgfd hfdr khfd";
		char[] allchars = s1.toCharArray();
		for (int i = 0; i < allchars.length; i++) {
			char c = s1.charAt(i);
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
