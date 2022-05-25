package java_Exam;

import java.util.Scanner;

public class SwapingTwoNumber_WithOutThirdVar {
	public static void main(String[] args) {
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enetr a vallue here");
		a=s.nextInt();
		System.out.println("Enter b value here");
		b=s.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a value is: "+a);
		System.out.println("b value is: "+b);
		
		
		
	}

}
