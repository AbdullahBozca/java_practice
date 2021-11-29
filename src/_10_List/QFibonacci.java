package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QFibonacci {
	/*
	 * Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
	 * 1-1-2-3-5-8-13-21-34....
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Fibonacci dizisinin karakter sayısını giriniz: ");
		int sayi=scan.nextInt();
		int toplam=0;
		ArrayList<Integer> fibo=new ArrayList<Integer>();
		fibo.add(1);
		fibo.add(1);
		for (int i = 2; i < sayi; i++) {
			toplam=(fibo.get(fibo.size()-2))+(fibo.get(fibo.size()-1));
			fibo.add(toplam);
		}
		System.out.println(fibo);
	}
}
