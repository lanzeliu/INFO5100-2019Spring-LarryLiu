package assignment4;

import java.util.ArrayList;

public class FirstQuestion {
	// Required function:
	public int NoneRepeating(String s) {
		// Helper ArrayList for saving the char:
		ArrayList<Character> notes = new ArrayList<>();
		// For loop for judging whether there's a repeating element:
		for (int i=0; i<s.length(); i++) {
			if (s.indexOf(s.charAt(i), i+1) == -1) {
				if (notes.contains(s.charAt(i)) == false) {
					return i;
				}
				else {
					continue;
				}
			}
			else {
				char index = s.charAt(i);
				notes.add(index);
			}
		}
		// return -1 if not repeating element:
		return -1;
	}
}
