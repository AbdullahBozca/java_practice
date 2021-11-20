package _07_ForLoop;

import java.util.Scanner;

public class Q10 {
	/*
	 * Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf
	 * olduğunu, değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf
	 * değilse yada 1 karakterden fazla ise hata mesajı göstersin. (Test girilen
	 * harfi büyük yada küçüklüğüne duyarlıdır.)
	 * 
	 * Sesli harfler: a,e,i,o,u
	 * 
	 * Test Data: a
	 * 
	 * Beklenen Çıktı: a harfi sesli harfdir.
	 * 
	 * Test Data: d
	 * 
	 * Beklenen Çıktı: d harfi sesiz harftir.
	 * 
	 * Test Data: we yada %
	 * 
	 * Beklenen Çıktı: Yanlis karakter girdiniz!
	 * 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String girilen = scan.next();
		String sesli = "aeiouAEIOU";
		if (girilen.length() == 1) {
			if (girilen.charAt(0) >= 'A' && girilen.charAt(0) <= 'Z'
					|| girilen.charAt(0) >= 'a' && girilen.charAt(0) <= 'z') {
				for (int i = 0; i < sesli.length(); i++) {
					if (girilen.charAt(0) == sesli.charAt(i)) {
						System.out.println("girilen harf seslidir.");
						break;
					} 
						if (girilen.charAt(0)!=sesli.charAt(i)) {
							System.out.println("Girilen harf sessizdir");
							//break;
						}
						
					
				}
			} else
				System.out.println("doğru karakter giriniz.");
		} else
			System.out.println("harf giriniz. ");

	}
}
