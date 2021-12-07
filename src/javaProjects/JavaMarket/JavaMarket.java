package javaProjects.JavaMarket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaMarket {
	static ArrayList<String> urunler=new ArrayList<String>(Arrays.asList("Domates","Patates","Biber","Soğan","Havuç","Elma","Muz","Çilek","Kavun","Üzüm","Limon"));
	static ArrayList<Double> urunFiyati= new ArrayList<Double>(Arrays.asList(2.10,3.20,1.50,2.30,3.10,1.20,1.90,6.10,4.30,2.70,0.50));	
	static ArrayList<String> sepetUrun=new ArrayList<String>();
	static ArrayList<Double> sepetKg=new ArrayList<Double>();
	static ArrayList<Double> sepetFiyat=new ArrayList<Double>();
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {

		/* Basarili Market alış-veriş programı.
		 *
		 * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
		 * 			No 	   Ürün 		  Fiyat
				   ====	 =======	 	=========
					00	 Domates   	 	 2.10 TL
					01	 Patates   	 	 3.20 TL
					02	 Biber     	 	 1.50 TL
					03	 Soğan      	 2.30 TL
					04	 Havuç     	   	 3.10 TL
					05	 Elma      	   	 1.20 TL
					06	 Muz     	 	 1.90 TL
					07	 Çilek 	 		 6.10 TL
					08	 Kavun      	 4.30 TL
					09	 Üzüm      	 	 2.70 TL
					10	 Limon     	 	 0.50 TL

		 * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
		 * 3. Adım: Kaç kg satın almak istediğini sorunuz.
		 * 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız.
		 * 5. Başka bir ürün alıp almak istemediğini sorunuz.
		 * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz.
		 * 7. Eğer bitirmek istiyorsa ödemeyi kontrol edip para ustu hesaplayarak  programı bitirinzi.
		 */
		
		String devam="";
		double toplamFiyat=0;
		do {
			urunListesi();
			System.out.println("Seçeceğiniz ürün kodu giriniz: ");
			int urunNo=scanner.nextInt();
			System.out.println("Kaç kilo alacaksınız :");
			double kg=scanner.nextDouble();
			sepetEkle(urunNo,kg);
			toplamFiyat=sepetHesapla();
			System.out.println("devam edeceksiniz e basınız.");
			devam=scanner.next();
		} while (devam.equalsIgnoreCase("e"));
		odeme(toplamFiyat);
		
	}

private static double sepetHesapla() {
	double toplamTutar=0;	
	for (Double each : sepetFiyat) {
			toplamTutar+=each;
		}
		return toplamTutar;
	}

private static void odeme(double toplamFiyat) {
	
	System.out.println("Ödemeniz gereken toplam miktar: "+toplamFiyat);
	double nakit=0;
	do {
		System.out.println("lütfen ödemenizi giriniz: ");
		nakit=scanner.nextDouble();
		
	} while (nakit<toplamFiyat);
	
}

	private static void sepetEkle(int urunNo, double kg) {
		sepetUrun.add(urunler.get(urunNo));
		sepetKg.add(kg);
		sepetFiyat.add(urunFiyati.get(urunNo)*kg);
		
		
	}



	private static void urunListesi() {
		System.out.println(" No\t\t Urunler\t\t Fiyatlar");
		System.out.println("=====\t\t=========\t\t===========");
		for (int i = 0; i <urunler.size() ; i++) {
			System.out.println(" "+i+"\t\t"+urunler.get(i)+"\t\t\t"+urunFiyati.get(i)+" TL");
		}
	}
}
