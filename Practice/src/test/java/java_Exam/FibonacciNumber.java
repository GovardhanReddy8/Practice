package java_Exam;

import java.util.Scanner;

public class FibonacciNumber {
	public static void main(String[] args) {
		
		int num,first=0,second=1,next;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter numberehere:");
		num=s.nextInt();
		System.out.println("results is:");
		for (int i = 0; i < num; i++) {
			System.out.println(first);
			next=first+second;
			first=second;
			second=next;
			
		}
		
	}

}