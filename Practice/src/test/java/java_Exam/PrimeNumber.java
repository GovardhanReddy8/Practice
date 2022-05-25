package java_Exam;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int num,i=1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number here");
		num=s.nextInt();
		for(i=2;i<num;i++) {
			if (num%i==0) {
				System.out.println("Not a prime number");
				break;
				
			}
			
		}
		if (num==i) {
			System.out.println("Prime number");
			
		}
	}

}
