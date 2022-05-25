package java_Exam;

import java.util.Scanner;

import org.apache.commons.compress.harmony.unpack200.bytecode.forms.IincForm;

public class Even_Odd_Numbers {
	public static void main(String[] args) {
		int num = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number here:");
		num = s.nextInt();
		if (num % 2 == 0) {
			System.out.println("Even number");

		} else {
			System.out.println("Odd number");

		}

	}

}
