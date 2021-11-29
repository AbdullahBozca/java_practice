package _08_While_DoWhile;

import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {
        /*  Problem Tanımı
        Verilen bir sayının faktöriyelini özyineli (recursive) olarak
        hespalayan fonksiyonu yazınız.

        Örnek Ekran Çıktıları
        Bir sayi giriniz: 6
        Faktöriyeli: 720

        Bir sayı giriniz: 3
        Faktöriyeli 6
     */

    	System.out.println(faktoriyel());
    }

	private static int faktoriyel() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Faktoriyeli hesaplancak sayıyı giriniz: ");
		int sayi=scan.nextInt();
		int faktoriyel=1;
		do {
			faktoriyel*=sayi;
			sayi--;
		} while (sayi>0);
		return faktoriyel;
	}
	
}


