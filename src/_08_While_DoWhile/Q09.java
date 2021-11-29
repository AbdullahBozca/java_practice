package _08_While_DoWhile;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		// kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.
		Scanner scan = new Scanner(System.in);
		int pin = 0;
		int sPin = 1234;
		
		do {
			System.out.println("PIN giriniz: ");
			pin = scan.nextInt();
		} while (pin != sPin);
		System.out.println("doğru pin girdiniz.");
	}
}
