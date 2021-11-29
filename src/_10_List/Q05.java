package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q05 {
	public static void main(String[] args) {
		// Kullanıcıdan alacağınız 6 elemanlı bir dizinin
		// sadece tek elemanlarını ayrı diziye bir metodda atayarak
		// main de yazdırınız.
		int arr[] = new int[6];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + ". sayıyı giriniz: ");
			arr[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.print("Girilen dizinin tek indexdeki değerleri: ");
		tekElemanlar(arr);
	}

	private static void tekElemanlar(int[] arr) {

		List<Integer> tek = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				tek.add(arr[i]);
			}
		}
		System.out.println(tek);
	}

}
