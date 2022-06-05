package java_practice;

import java.util.Scanner;

import org.junit.Test;

public class FactoroalNumber {
	@Test
	public void fact() {
		int num,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		num=sc.nextInt();
		for (int i = 1; i <= num; i++) {
			fact=fact*i;
			
		}
		System.out.println("Results are:"+fact);
		
		
	}

}
