package java_Exam;

import java.util.Scanner;

public class PolindromNumber {
	public static void main(String[] args) {
		
		int num,a,b,pol=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		num=s.nextInt();
		b=num;
		while (num>0) {
			a=num%10;
			num=num/10;
			pol=pol*10+a;
		}
		if (pol==b) {
			System.out.println("Polindrom");
			
		}else {
			System.out.println("not polindrom");
		}
	}

}