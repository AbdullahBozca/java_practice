package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QManav {
	static List<String> urunListesi = new ArrayList<>(Arrays.asList("domates", "biber", "soğan", "elma", "portakal"));
	static List<Double> urunFiyatlari = new ArrayList<>(Arrays.asList(3.5, 5.0, 6.5, 4.5, 8.0));
	static double toplanOdenecekTutar;

	public static void main(String[] args) {
		/*
		 * Basit bir 5 ürünlü manav alisveris programi yaziniz.
		 *
		 * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor. 2. Adim :
		 * Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari
		 * goster, istiyorsa tekrar urun sectir. Bu islemi alisverisi bitirmek isteyene
		 * kadar tekrarla. 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini
		 * toplam fiyata ekle. 4. Adim : Alisveris bitince toplam odemesi gereken tutari
		 * goster.
		 *
		 */
		Scanner scan = new Scanner(System.in);
		int tercih = 0;
		char cikis = ' ';
		double kilo = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println(urunListesi.get(i)+"="+urunFiyatlari.get(i)+" tl");
		}
		do {
			for (int i = 0; i < urunListesi.size(); i++) {
				System.out.println((i + 1) + ". ürün " + urunListesi.get(i));
			}
			System.out.println("Ürün seçin: ");
			tercih = scan.nextInt();
			switch (tercih) {
			case 1:
				System.out.println("Kaç kilo " + urunListesi.get(0) + " istiyorusunuz: ");
				kilo = scan.nextDouble();
				toplanOdenecekTutar += urunFiyatlari.get(0) * kilo;
				break;
			case 2:
				System.out.println("Kaç kilo " + urunListesi.get(1) + " istiyorusunuz: ");
				kilo = scan.nextDouble();
				toplanOdenecekTutar += urunFiyatlari.get(1) * kilo;
				break;
			case 3:
				System.out.println("Kaç kilo " + urunListesi.get(2) + " istiyorusunuz: ");
				kilo = scan.nextDouble();
				toplanOdenecekTutar += urunFiyatlari.get(2) * kilo;
				break;
			case 4:
				System.out.println("Kaç kilo " + urunListesi.get(3) + " istiyorusunuz: ");
				kilo = scan.nextDouble();
				toplanOdenecekTutar += urunFiyatlari.get(3) * kilo;
				break;
			case 5:
				System.out.println("Kaç kilo " + urunListesi.get(4) + " istiyorusunuz: ");
				kilo = scan.nextDouble();
				toplanOdenecekTutar += urunFiyatlari.get(4) * kilo;
				break;

			default:
				break;
			}
			System.out.println("Alışverişe devam etme istiyorsanız D Bitirmek istiyorsanız C");
			cikis = scan.next().toUpperCase().charAt(0);
		} while (cikis != 'C');
		System.out.println("ödenecek miktar : "+toplanOdenecekTutar);

	}
}
