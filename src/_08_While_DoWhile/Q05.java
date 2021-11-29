package _08_While_DoWhile;

import java.util.Scanner;

/*
 * sayinin basamak degerlerinin toplamini while loop ile yapin bir method create ediniz.
 */
public class Q05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi = scan.nextInt();

		System.out.println(basamakToplama(sayi));

	}

	public static int basamakToplama(int sayi) {
		
		int toplam =0;
		while(sayi!=0){
			
			toplam += sayi%10;
			sayi/=10;
			
		}
		return toplam;
		
	}
}
