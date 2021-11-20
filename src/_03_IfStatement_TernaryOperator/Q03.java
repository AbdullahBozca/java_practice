package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("boyunuzu giriniz:(cm) ");
		double boy=(scan.nextDouble())/100;
		System.out.println("kilonuzu giriniz:(kg) ");
		double kilo=scan.nextDouble();
		
		double vki=kilo/(boy*boy);
		
		if (vki<=20) {
			System.out.println("Oldukça zayýfsýn.");
			
		} else if(vki<=25) {
			System.out.println("Normal Sýnýrdasýnýz.");

		} else if (vki<=30) {
			System.out.println("þiþman kategorisindesiniz");
		}else {
			System.out.println("obezsiniz.");
		}
		{
			
		}
		
		
    }

}
