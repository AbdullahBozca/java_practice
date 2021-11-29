package _08_While_DoWhile;

import java.util.Scanner;

public class Q06 {
	static int bolum = 0;

	public static void main(String[] args) {
		// kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
		// kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create
		// ediniz.

		Scanner scan = new Scanner(System.in);
		System.out.println("Bölünen sayi giriniz: ");
		int bolunen = scan.nextInt();
		System.out.println("Bölüm sayısını giriniz: ");
		int bolum = scan.nextInt();

		bolum(bolunen, bolum);

	}

	private static void bolum(int bolunen, int bolum) {
		int bolunenİlk = bolunen;
		int sayac = 0;
		while (bolunen >= bolum) {
			bolunen = bolunen - bolum;
			sayac++;

		}
		System.out.println(bolunenİlk + "/" + bolum + "=" + sayac);

	}

}
