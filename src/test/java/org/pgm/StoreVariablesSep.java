package org.pgm;

import java.util.ArrayList;
import java.util.List;

public class StoreVariablesSep {

	public static void main(String[] args) {
		String alph = "";
		String s = "cap$?@gem23ini=+4efg";
		List alpha = new ArrayList();
		List digit = new ArrayList();
		List sp = new ArrayList();
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if (Character.isAlphabetic(a)) {
				alpha.add(a);
			} else if (Character.isDigit(a)) {
				digit.add(a);

			} else {
				sp.add(a);
			}

		}
		System.out.println("Alphabet " + alpha);
		System.out.println("Digit " + digit);
		System.out.println("Special Characters " + sp);
	}

}
