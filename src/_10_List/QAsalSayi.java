package _10_List;

import java.util.ArrayList;
import java.util.List;

public class QAsalSayi {

	/*
	 * 100 den kucuk asal sayilari yazdiran bir program yaziniz
	 */
	public static void main(String[] args) {

		ArrayList<Integer> sayilar = new ArrayList<Integer>();
		for (int i = 1; i <= 100; i++) {
			sayilar.add(i);
		}
		System.out.println(sayilar);
		int count = 0;
		ArrayList<Integer> asalSayilar = new ArrayList<Integer>();
		for (int i = 0; i <= sayilar.size()-1; i++) {
			
			for (int j = 1; j <= sayilar.size()-1; j++) {
				
				if (sayilar.get(i) % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(sayilar.get(i) + " asal sayı");
				asalSayilar.add(i+1);
			} else {
				System.out.println(sayilar.get(i) + " asal sayı değil");

			}
			count = 0;
		}
		System.out.println(asalSayilar);
	}
}
