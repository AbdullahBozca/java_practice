package _08_While_DoWhile;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// indexi tek sayi olan karakterleri yazdiran bir code create ediniz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir kelime giriniz: ");
		String kelime=scan.next();
		int sayac=0;
		while (sayac<=kelime.length()-1) {
			if (sayac%2==1) {
				System.out.print(sayac+". index:"+ kelime.charAt(sayac)+" ");
			}
			System.out.println();
			sayac++;
		}
	}

}
