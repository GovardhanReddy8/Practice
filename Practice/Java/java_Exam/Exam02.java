package java_Exam;

import java.util.HashMap;

public class Exam02 {
	public static void main(String[] args) {
		String s1="hgf dhg sjh vgfd";
		char[] allchars = s1.toCharArray();
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		for (int i = 0; i < allchars.length; i++) {
			char c = s1.charAt(i);
			if (hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c)+1);
				
			}else {
				hmap.put(c, 1);
			}
			
			
		}
		for (int i = 0; i < allchars.length; i++) {
			if (hmap.get(s1.charAt(i))==1) {
				System.out.println(s1.charAt(i));
				
			}
			
		}
	}

}
