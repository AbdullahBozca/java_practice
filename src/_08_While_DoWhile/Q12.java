package _08_While_DoWhile;

import java.util.Scanner;

public class Q12 {

    //Bir top 220 m  yükseklikten atılmaktadır.
    // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulunuz.

    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Topun bırakıldığı yüksekliği giriniz: ");
    	double h=scan.nextDouble();
    	double toplamYol=0;
    	int sayac=0;
    	while (h>=1) {
    		toplamYol+=h;
			h*=(0.75);
			
			sayac++;
		}
    	System.out.println(sayac+" kere yere vurdu.");
    	System.out.println("Topun gittiği yol: "+toplamYol);
    }
}
