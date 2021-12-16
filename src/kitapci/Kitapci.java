package kitapci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kitapci {
	static List<Kitap> kitapList = new ArrayList<Kitap>();
	static int kitapNo = 1000;

	public static void main(String[] args) {
		menu(kitapList);
	}

	public static void menu(List<Kitap> liste) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("========= KİTAP PROGRAMI =============\n1: Kitap ekle\n2: Numara ile kitap sil\n3: "
				+ "Tum kitaplari listele\n4: Bitir");
		System.out.println("İşleminizi seçiniz : ");
		int tercih = scanner.nextInt();
		switch (tercih) {
		case 1:
			kitapEkle(liste);
			break;
		case 2:
			noIleSil(liste);
			break;
		case 3:
			listele(liste);
			break;
		case 4:
			bitir();
			break;

		default:
			System.out.println("Yanlış giriş yapıldı. Tekrar deneyiniz!!!");
			break;
		}
	}

	private static void listele(List<Kitap> liste) {
		for (Kitap k : liste) {
			System.out.println(k.toString());
		}
		menu(liste);
	}

	private static void noIleSil(List<Kitap> liste) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Silenecek kitap no giriniz : ");
		int silinecekNo=scanner.nextInt();
		for (Kitap k : liste) {
			if (silinecekNo==k.getNo()) {
				liste.remove(k);
				menu(liste);
			}
		}
		System.out.println(silinecekNo+ " ait kitap bulunamadı !!!");
		menu(liste);
	}

	private static void kitapEkle(List<Kitap> liste) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kitap ismi giriniz : ");
		String kitapAdi=scanner.nextLine();
		System.out.println("Kitabın yazar ismini giriniz : ");
		String yazarAdi=scanner.nextLine();
		System.out.println("Yayın yılını giriniz : ");
		int yayinYili=scanner.nextInt();
		System.out.println("Kitabın fiyatını giriniz : ");
		double fiyat=scanner.nextDouble();
		Kitap kitap=new Kitap(++kitapNo,kitapAdi,yazarAdi,yayinYili,fiyat);
		liste.add(kitap);
		System.out.println(kitap.toString() + " eklendi...");
		menu(liste);
	}

	private static void bitir() {
		System.out.println("Yine bekleriz...");
		
	}
}
