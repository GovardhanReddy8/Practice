package java_practice;

import java.util.Scanner;

import org.junit.Test;

public class EvenOddNumber {
	@Test
	public void evenodd() {
		int num=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		num=sc.nextInt();
		if (num%2==0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd Number");
		}
		
		
	}

}
