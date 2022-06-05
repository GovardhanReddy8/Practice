package java_practice;

import org.junit.jupiter.api.Test;

public class NonReapSimple {
	
	@Test
	public void nonreap() {
		String s="kjhgfdsbkjhgfcvfdg";
		char[] allchars = s.toCharArray();
		for (int i = 0; i < allchars.length; i++) {
			
			char c = s.charAt(i);
			if (s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))) {
				
				System.out.println("nonreap:"+s.charAt(i));
				break;
			}
		}
		
	}

}
