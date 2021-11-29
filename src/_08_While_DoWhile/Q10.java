package _08_While_DoWhile;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
        // Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.
    	Scanner scan=new Scanner(System.in);
    	int sayac=1;
    	int buyuk=0;
    	int sayi=0;
    	while (sayac<=5) {
    		System.out.print(sayac+". sayıyı giriniz: ");
    		sayi=scan.nextInt();
    		if(buyuk<sayi)
    		{
    			buyuk=sayi;
    		}
    		sayac++;
    			
    	}
    	System.out.println("en büyük sayı: "+buyuk);
    }
}
