package java_Exam;

import java.util.Scanner;

public class NumberOfDigits {
	public static void main(String[] args) {
		
		int num,a=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number:");
		num=s.nextInt();
		if (num<0) {
			num=num*-1;
		}else if (num==0) {
			num=1;
			
		}
		while (num>0) {
			num=num/10;
			a++;
			
		}
		System.out.println("Results:"+a);
		
		
	}

}