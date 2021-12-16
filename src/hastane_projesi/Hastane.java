package hastane_projesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hastane extends VeriBankasi {
	static ArrayList<Doktor> doktorListesi = new ArrayList<Doktor>();
	static ArrayList<Hasta> hastaListesi = new ArrayList<Hasta>();
	static int hastaId = 1000;

	

	public static void menu(ArrayList<Doktor> doktorListesi, ArrayList<Hasta> hastaListesi) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("========= HASTANE OTOMASYONU =============\n1: Doktor ekle\n2: Hasta ekle\n3: Hasta listele\n4: Çıkış");
		System.out.println("Seçiminizi Giriniz : ");
		int secim = scanner.nextInt();

		if (secim == 1) {
			doktorEkle(doktorListesi);
		} else if (secim == 2) {
			hastaEkle(hastaListesi);
		}else if (secim==3) {
			hastaListele(hastaListesi);
		}else if (secim==4) {
			cikis();
		} else {
			System.out.println("Doğru değer girilmedi");
			menu(doktorListesi, hastaListesi);
		}
	}

	private static void cikis() {
		System.out.println("İşlemler tamamlandı!!!");
		
	}

	private static void hastaListele(ArrayList<Hasta> hastaListesi2) {
		System.out.println(hastaListesi2);
		
		
		
		
		
		
		
		menu(doktorListesi, hastaListesi2);
	}

	private static void hastaEkle(ArrayList<Hasta> hastaListesi2) {
		Hastane hastane = new Hastane();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hasta adı giriniz : ");
		String hastaAdi = scanner.nextLine();
		System.out.println(hastane.getDurumlar());
		ArrayList<String> lst = hastane.getDurumlar();
		System.out.println("Hastanın şikayeti belirleyiniz : ");
		int sikayet = scanner.nextInt();
		String sikayetStr = "";
		for (int i = 0; i < lst.size(); i++) {
			if (sikayet == i + 1) {
				sikayetStr = lst.get(i);
			}
		}
		System.out.println("Hasta durumu acil ise 1 değil ise 2 ye basınız!!!");
		int acil = scanner.nextInt();
		boolean aciliyet = false;
		if (acil == 1) {
			aciliyet = true;
		} else if (acil == 2) {
			aciliyet = false;
		} else
			System.out.println("Geçerli değer girilmedi.");
		Hasta hasta = new Hasta(++hastaId,hastaAdi,sikayetStr,aciliyet);
		System.out.println(hasta.toString());
		menu(doktorListesi, hastaListesi2);

	}

	private static void doktorEkle(ArrayList<Doktor> doktorListesi2) {
		Hastane hastane = new Hastane();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Doktor ismi giriniz : ");
		String doktorAd = scanner.nextLine();
		System.out.println(hastane.getUnvanlar());
		ArrayList<String> lst = hastane.getUnvanlar();
		System.out.println("Doktor ünvanı girmek için ünvan numarasını giriniz : ");
		int unvan = scanner.nextInt();
		String unvanStr = "";
		for (int i = 0; i < lst.size(); i++) {
			if (unvan == i + 1) {
				unvanStr = lst.get(i);
			}
		}
		Doktor doktor = new Doktor(doktorAd, unvanStr);
		System.out.println(doktor.toString());
		menu(doktorListesi2, hastaListesi);
	}

}
