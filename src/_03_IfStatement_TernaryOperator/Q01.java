package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Bi sayý girive: ");
		double sayi1=scan.nextDouble();
		System.out.println("Bi dene daha sayý girive:");
		double sayi2=scan.nextDouble();
		System.out.println("iþlem seçiniz(+,-,*,/)");
		char islem=scan.next().charAt(0);
		if (islem=='+') {
			System.out.println("sayýlarýn toplamý:"+(sayi1+sayi2));
		} else if(islem=='-'){
			System.out.println("sayýlarýn farký: "+(sayi1-sayi2));

		}else if(islem=='*') {
			System.out.println("sayýlarýn çarpýmý: "+(sayi1*sayi2));
			
		 
		}else if (islem=='/') {
			System.out.println("sayýlarýn bölümü:"+(sayi1/sayi2));
			
		}else {
			System.out.println("beni bak düzgün iþlem seç!!");
		} 
		{
			
		}
		
		
		
		
	}

}
