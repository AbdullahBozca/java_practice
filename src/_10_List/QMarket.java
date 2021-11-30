package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class QMarket {
	/*
	 * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program
	 * yazınız. Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir
	 * method yazınız. Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını
	 * gösteren bir method yazınız. Ayrıca bakkalın hangi günler ortalamanın altında
	 * kazandığını gösteren bir method yazınız.
	 *
	 * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler) 2. Adım :
	 * Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun.
	 * (gunlukKazanclar) 3. Adım : While döngüsü ile kullanıcıdan 7 günlük
	 * kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle. 4. Adım :
	 * getOrtalamaKazanc() adlı method ile ortalama kazancı alın. 5. Adım :
	 * getOrtalamaninUstundeKazancGünleri() adlı method oluşturun. for döngüsü ile
	 * tüm günleri ortalama kazanç ile karşılaştır ortalama kazançtan yüksekse o
	 * günleri return yap. 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı
	 * method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
	 * ortalama kazançtan aşağıysa o günleri return yap.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> gunler = new ArrayList<String>(
				Arrays.asList("Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"));
		ArrayList<Double> gunlukKazanc = new ArrayList<Double>();
		int sayac = 0;
		while (sayac < gunler.size()) {
			System.out.println(gunler.get(sayac) + " günün kazancı: ");
			gunlukKazanc.add(scan.nextDouble());
			sayac++;
		}
		double ortalamaKazanc = getOrtalamaKazanc(gunlukKazanc);
		ArrayList<String> ortalamaninUstu = new ArrayList<String>();
		ortalamaninUstu.addAll(getOrtalamaninUstundeKazancGünleri(ortalamaKazanc, gunler, gunlukKazanc));
		System.out.println("Ortalamanın üstünde olan günler " + ortalamaninUstu);
		ArrayList<String> ortalamaninAlti = new ArrayList<String>();
		ortalamaninAlti.addAll(getOrtalamaninAltindaKazancGünleri(ortalamaKazanc, gunler, gunlukKazanc));
		System.out.println("Ortalmanın altında olan günler " + ortalamaninAlti);
		for (int i = 0; i < gunler.size(); i++) {
			if (ortalamaKazanc==gunlukKazanc.get(i)) {
				System.out.println(gunler.get(i)+" haftalık ortalamada kazanç sağladınız.");
			}
		}

	}

	private static ArrayList<String> getOrtalamaninAltindaKazancGünleri(double ortalamaKazanc, ArrayList<String> gunler,
			ArrayList<Double> gunlukKazanc) {
		ArrayList<String> OrtalamaninAltindakiGünleri = new ArrayList<String>();
		for (int i = 0; i < gunler.size(); i++) {
			if (gunlukKazanc.get(i) < ortalamaKazanc) {
				OrtalamaninAltindakiGünleri.add(gunler.get(i));
			}
		}
		return OrtalamaninAltindakiGünleri;
	}

	private static ArrayList<String> getOrtalamaninUstundeKazancGünleri(double ortalamaKazanc, ArrayList<String> gunler,
			ArrayList<Double> gunlukKazanc) {
		ArrayList<String> OrtalamaninUstundeKazancGünleri = new ArrayList<String>();
		for (int i = 0; i < gunler.size(); i++) {
			if (gunlukKazanc.get(i) > ortalamaKazanc) {
				OrtalamaninUstundeKazancGünleri.add(gunler.get(i));
			}
		}
		return OrtalamaninUstundeKazancGünleri;
	}

	private static double getOrtalamaKazanc(ArrayList<Double> gunlukKazanc) {
		double ortalamaKazanc = 0;
		double toplam = 0;
		for (int i = 0; i < gunlukKazanc.size(); i++) {
			toplam += gunlukKazanc.get(i);
		}
		ortalamaKazanc = toplam / gunlukKazanc.size();
		System.out.println("Ortalma kazanaç: " + ortalamaKazanc);
		return ortalamaKazanc;
	}
}