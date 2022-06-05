package java_practice;

import java.util.HashMap;
import java.util.Iterator;

import org.junit.jupiter.api.Test;

public class NonReapChar_HashMap {
	@Test
	public void nonrep() {
		String s = "kjhgfslkjhgfdsert";
		char[] allchars = s.toCharArray();
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		for (int i = 0; i < allchars.length; i++) {
			char c = s.charAt(i);
			if (hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c) + 1);

			} else {
				hmap.put(c, 1);
			}
		}
		for (int i = 0; i < allchars.length; i++) {
			if (hmap.get(s.charAt(i)) == 1) {
				System.out.println("nonReapchars:" + s.charAt(i));
				break;

			}
		}
	}

}
