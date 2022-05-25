package java_Exam;

import java.util.HashMap;

public class NonRepeatingchar_hashMap {
	public static void main(String[] args) {
		
		String s="jhggvbnjhgytrdfcv";
		char[] allchars = s.toCharArray();
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		for (int i = 0; i < allchars.length; i++) {
			char c = s.charAt(i);
			if (hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c)+1);
			} else {
				hmap.put(c, 1);

			}
		}
		for (int i = 0; i < allchars.length; i++) {
			if (hmap.get(s.charAt(i))==1) {
				System.out.println(s.charAt(i));
				
			}
			
		}
		
		
		
		
		
	}

}
