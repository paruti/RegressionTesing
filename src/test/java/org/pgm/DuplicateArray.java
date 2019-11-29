package org.pgm;

public class DuplicateArray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 3, 5, 6, 6, 7, 8 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);

				}
			}
		}

	}
}