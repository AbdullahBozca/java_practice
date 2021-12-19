package arac_kiralama;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 
​
	1-
	kullanıcı  islem fields -->
	String alinacakSehir;
	String alinacakGun; (MM,dd--> ay gun formatında olmalı)
	double alisSaati;
	String teslimGunu;  (MM,dd--> ay gun formatında olmalı)
	double teslimSaati;
​
arac fields -->
String marka; (liste araclari --> opel toyota volvo)
String model;  (astra corolla s60)
String yakitTipi;  (diesel benzin)
String vites; (manuel otomatik)
double gunlukUcret; ( 100 120 150... liste dısı arac=300)
​
2-musteriden  yukarida ozellikleri verilen liste araclardan  
tercihini alınız. eger musteri farklı bir arac talep ederse
talep ettigi aracın fields'larını alınız.
musterinin ad, soyad, yas, telefon, id  ve kredi kartı bilgileri ile 
  arac tercihine ve islemine gore odemesini gerçekleştriniz..
​
 */
public class AracRunner {
	static List<Musteri> musteriBilgileri = new ArrayList<>(Arrays.asList());
	static List<AracDepo> aracListesi = new ArrayList<>(Arrays.asList());
	static Scanner scan = new Scanner(System.in);
	static int aracNo = 99;

	public static void main(String[] args) {
		aracEkle(aracListesi);
		// musteriBilgileri(musteriBilgileri);
		Menu();

	}

	private static void Menu() {

		System.out.println(aracListesi);
		System.out.println("Yapmak istediğiniz işlemi seçiniz : \n1-Araç kiramala\n2-Çıkış ");
		int secim = scan.nextInt();
		switch (secim) {
		case 1:
			aracKiralama(aracNo);
			break;
		case 2:

			break;
		default:
			break;
		}

	}

	private static void aracKiralama(int aracNo2) {
		System.out.println("Seçmek istediğiniz araç numarasını giriniz: ");
		int aracSecim = scan.nextInt();
		for (AracDepo each : aracListesi) {
			if (each.getAracNo() == aracSecim) {
				int index = aracSecim - 100;
				System.out.println("Seçtiğiniz araç : " + aracListesi.get(index));
				musteriBilgileri(musteriBilgileri, aracListesi, index);

			}
		}

	}

	private static void musteriBilgileri(List<Musteri> musteriBilgileri, List<AracDepo> aracListesi, int index) {
		/*
		 * String ad;String soyAd;String yas; String telefon; String id; String kartNo;
		 */

		System.out.println("Isim Gir");
		String isim = scan.next();
		System.out.println("Soy Isim Gir");
		String soyIsim = scan.next();
		System.out.println("Yas Gir");
		String yas = scan.next();
		System.out.println("Tel No Gir");
		String telNo = scan.next();
		System.out.println("Tc Gir");
		String tc = scan.next();
		System.out.println("Kart No Giriniz");
		String kartNo = scan.next();
		System.out.println("Alınacak şehir : ");
		String sehir = scan.next();

		System.out.println("Alınacak günü giriniz(dd-MM-yyyy) : ");
		String alinacakGun = scan.next();
		// String arrAlinacakGun[]=alinacakGun.split("/");
		System.out.println("Alış saatini giriniz (HH:mm:ss): ");
		String alisSaati = scan.next();
		String alinanTarih = alinacakGun + " " + alisSaati;
		System.out.println("Teslim gününü giriniz(dd-MM-yyyy) : ");
		String teslimGunu = scan.next();
		// String arrTeslimGunu[]=teslimGunu.split("/");
		System.out.println("Teslim saaatini giriniz (HH:mm:ss): ");
		String teslimSaati = scan.next();
		String teslimTarih = teslimGunu + " " + teslimSaati;
		Tarih tarih = new Tarih();

		Musteri musteri = new Musteri(isim, soyIsim, yas, telNo, tc, kartNo, sehir, alinacakGun, alisSaati, teslimGunu,
				teslimSaati);
		musteriBilgileri.add(musteri);
		System.out.println(musteri);
		System.out.println("Kiralama süresi : " + Tarih.findDifference(alinanTarih, teslimTarih));
		System.out.println("Ödenecek tutar : "
				+ ((aracListesi.get(index).getGunlukUcret()) * Tarih.findDifference(alinanTarih, teslimTarih)));
	}

	private static void aracEkle(List<AracDepo> aracListesi) {
		/*
		 * String marka; (liste araclari --> opel toyota volvo) String model; (astra
		 * corolla s60) String yakitTipi; (diesel benzin) String vites; (manuel
		 * otomatik) double gunlukUcret; ( 100 120 150... liste dısı arac=300)
		 */

		AracDepo opel1 = new AracDepo(++aracNo, "Opel", "Astra", "Diesel", "Manuel", 100);
		aracListesi.add(opel1);
		AracDepo opel2 = new AracDepo(++aracNo, "Opel", "Astra", "Diesel", "Otomatik", 150);
		aracListesi.add(opel2);
		AracDepo opel3 = new AracDepo(++aracNo, "Opel", "Astra", "Benzin", "Manuel", 200);
		aracListesi.add(opel3);
		AracDepo opel4 = new AracDepo(++aracNo, "Opel", "Astra", "Benzin", "Otomatik", 250);
		aracListesi.add(opel4);

		// System.out.print(aracListesi);

	}
}