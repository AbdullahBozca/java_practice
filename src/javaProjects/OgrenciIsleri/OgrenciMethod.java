package javaProjects.OgrenciIsleri;

import java.util.ArrayList;
import java.util.Scanner;

public class OgrenciMethod {

	static int ogrenciNo = 1;

	public static void menu(ArrayList<Ogrenci> liste, ArrayList<OgrenciNot> notListe) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("========= ÖĞRENCİ İŞLERİ PROGRAMI =============\n1: ÖĞRENCİ KAYDI\n2: ÖĞRENCİ LİSTELE\n3: "
				+ "ÖĞRENCİ KAYIT SİLME\n4: NOT GİRİŞİ\n5: ÇIKIŞ");
		int secim = scanner.nextInt();

		switch (secim) {
		case 1:
			ogrKayit(liste);
			break;
		case 2:
			ogrListele(liste);
			break;
		case 3:
			ogrSil(liste);
			break;
		case 4:
			notGirisi(liste, notListe);
			break;
			
		case 5:
			cikis();
		default:
			break;
		}

	}

	private static void notGirisi(ArrayList<Ogrenci> liste, ArrayList<OgrenciNot> notListe) {
		Scanner scanner = new Scanner(System.in);
		OgrenciNot ogrenciNot = new OgrenciNot();
		System.out.println("Öğrenci numarası giriniz : ");
		int no = scanner.nextInt();
		for (Ogrenci ogrenci : liste) {
			if (no == ogrenci.getOgrNo()) {
				System.out.println(ogrenci.getOgrAdi() + "'nın notlarını giriniz : ");
				for (int i = 0; i < ogrenciNot.getDersAdi().size(); i++) {
					System.out.print(ogrenciNot.getDersAdi().get(i) + " : ");
					int not = scanner.nextInt();
					ogrenciNot.setDersNotu();
				}
			} else
				System.out.println("Öğrenci bulunamadı!!!");
		}

	}

	private static void cikis() {
		System.out.println("İşlemler bitti!!!");

	}

	private static void ogrSil(ArrayList<Ogrenci> liste) {
		Scanner scanner = new Scanner(System.in);
		for (Ogrenci o : liste) {
			System.out.println(o);
		}
		System.out.println("Silinecek öğrecinin numarasını giriniz : ");
		int no = scanner.nextInt();
		for (Ogrenci s : liste) {
			if (no == s.getOgrNo()) {
				liste.remove(s);

				for (Ogrenci o : liste) {
					System.out.println(o);
				}

				menu(liste, null);
			}
		}
		System.out.println("Silinecek öğrenici numarası bulunamadı!!!");
		menu(liste, null);
	}

	private static void ogrListele(ArrayList<Ogrenci> liste) {
		System.out.println("========= TÜM ÖĞRENCİ LİSTESİ =============");
		for (Ogrenci o : liste) {
			System.out.println(o);
		}
		menu(liste, null);
	}

	private static void ogrKayit(ArrayList<Ogrenci> liste) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Öğrencinin adını giriniz : ");
		String ad = scanner.nextLine();
		Ogrenci ogrenci = new Ogrenci(++ogrenciNo, ad);
		liste.add(ogrenci);
		System.out.println(ogrenci.toString() + " eklendi");
		menu(liste, null);
	}

}
