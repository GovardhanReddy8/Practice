package java_Exam;

import java.util.Scanner;

public class ReverseNumbers {
	public static void main(String[] args) {
		
		int num,rev=0,r;
		Scanner s = new Scanner(System.in);
		System.out.println("enetr number here");
		num=s.nextInt();
		while (num>0) {
			r=num%10;
			rev=rev*10+r;
			num=num/10;
			
		}
		System.out.println(rev);
		
		
		
		
	}

}
