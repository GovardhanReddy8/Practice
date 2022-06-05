package java_practice;

import java.util.Iterator;

import org.apache.poi.ss.formula.functions.Count;
import org.junit.jupiter.api.Test;

public class NonReapChar {
	@Test
	public void nonchar() {
		String s="jhgfvbdhdgtrgsjh";
		char[] allcgars = s.toCharArray();
		for (int i = 0; i < allcgars.length; i++) {
			char c = s.charAt(i);
			int count=0;
			for (int j = 0; j < allcgars.length; j++) {
				if (c==allcgars[j]) {
					count++;
					
				}
				
			}
			if (count==1) {
				System.out.println("non reapt:"+c);
				break;
				
			}
			
		}
	}
}


