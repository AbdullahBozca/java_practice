package _09_Arrays;

import java.util.Arrays;

public class Q05 {

	public static void main(String[] args) {
		/*
		 * write a java program that calculates the average value of array elements
		 * Print elements that are greater than avarage (dizi elemanlarinin ortalama
		 * degerini hesaplayan ve ortalamadan büyük olan elemanlari yazdıran bir java
		 * programi yazin) input[]= {1,2,3,4,5,6,7} Output : 4
		 */
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 10, 11, 5, 7, 99, 1, 0, 0 };
		int toplam = 0, ortalama = 0;
		for (int i = 0; i < arr.length; i++) {
			toplam += arr[i];
		}
		ortalama = toplam / arr.length;
		System.out.println("ortalama: " + ortalama);
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > ortalama) {
				System.out.println(arr[i]);
			}
		}

	}

}
