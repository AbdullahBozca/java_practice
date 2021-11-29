package _09_Arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Q16 {
	public static void main(String[] args) {
		/*
		 * Write a method which accepts string as parameter and prints the sum of digits
		 * present in thr given string input :"ade1r4d3" output : 8 trick : Use -->
		 * Character.isDigit() --> Integer.valueOf()
		 */
		String kelime = "ade1r4d3";
		String arr1[] = kelime.split("");
		int toplam = 0;
		for (int i = 0; i < arr1.length; i++) {

			if (Character.isDigit(arr1[i].charAt(0))) {
				toplam += Integer.valueOf(arr1[i]);
			} else
				continue;
		}

		System.out.println(toplam);

	}

}
