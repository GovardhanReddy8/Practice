package java_Exam;

import java.util.Scanner;

public class CountNumberOfWords {
	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner s = new Scanner(System.in);
		String sl = s.nextLine();
		int count=1;
		for (int i = 0; i < sl.length()-1; i++) {
			if ((sl.charAt(i)==' ') && (sl.charAt(i+1)!=' ')){
				count++;
				
			}
			
		}
		System.out.println(count);
		
		
	}

}
