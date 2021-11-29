package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
	// kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini 
	//kullanicidan alan ve girilen array elemanlarinin en buyuk ile en kucuk 
	//elemaninin arasinki farki gosteren java programi yazin
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Dizinin değerini giriniz: ");
		int sayi=scan.nextInt();
		int arr[]=new int[sayi];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+1+". sayıyı giriniz: ");
			int sayi2=scan.nextInt();
			arr[i]=sayi2;
		}
		Arrays.sort(arr);
		System.out.println("Enbüyük ve en küçük arasındaki fark: "+(arr[arr.length-1]-arr[0]));
		scan.close();
	}

}
