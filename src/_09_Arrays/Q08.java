package _09_Arrays;

import java.util.Arrays;

public class Q08 {

	public static void main(String[] args) {

		/*
		 * $ ve £ isareti olanlarin toplamlarini ayri ayri bulun
		 * 
		 * String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
		 */
		String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
		String arr[] = str.split(" ");
		System.out.println(Arrays.toString(arr));
		int toplamDolar = 0;
		int toplamPound = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains("$")) {

				toplamDolar += Integer.parseInt(arr[i].replace("$", ""));
			} else {

				toplamPound += Integer.parseInt(arr[i].replace("£", ""));
			}

		}
		System.out.println("dolar toplamı: " + toplamDolar);
		System.out.println("pound toplamı: " + toplamPound);
	}
}
