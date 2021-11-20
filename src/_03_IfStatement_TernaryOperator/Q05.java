package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// Kullanicidan  yasini ve kilosunu alaliniz
		// 18 yasindan kucuk ise kan bagisi yapamaz
		// 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		// 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.

		Scanner scan=new Scanner(System.in);
		System.out.print("Yaþýnýzý giriniz: ");
		int yas=scan.nextInt();
		System.out.print("kilonuzu giriniz: ");
		int kilo=scan.nextInt();
		System.out.println(yas<18 ? "kan baðýþý yapamaz!!":(kilo<50 ? "kan baðýþý yapamaz!!"
							:"kan baðýþý yapabilir!"));
		scan.close();
		}

}
