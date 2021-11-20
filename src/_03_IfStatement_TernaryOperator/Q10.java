package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

    	/* Problem tanimi : Kulanicidan aracacinin hizini aliniz Trafik cezasinin
		 * degerini hesaplayin. 45 hiz siniridir. 
		 * Eger Hiziniz 55-74 arasinda ise: Ceza 100 $'dir.
		 * Eger Hiziniz 75 - 84 arasinda ise: Ceza 150 $'dir.
		 * Eger Hiziniz 85 -94 arainda ise: Ceza 320 $'dir.
		 * Eger Hiziniz 94'den daha fazla ise: Ceza 500 $'dir.
		 * Eger kullanicinin ehliyeti yoksa cezaya 200 $ eklenir.
		 * orn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.
		 * -----------------------------------------
		 * Orn;
		 * currentSpeed(Hiziniz) 87 ve isDriverLicenceAvailable(Ehliyeti var mi) = true;
		 * sonuc 320 olmalidir.
		 * currentSpeed(Hiziniz) 65 ve isDriverLicenceAvailable(Ehliyeti var mÄ±?) =
		 * false; sonuc 300 olmalidir.
		 */
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Hýzýnýz giriniz: ");
    	double hiz=scan.nextDouble();
    	System.out.println("ehliyet varsa 1 yoksa 2");
    	int ehliyet=scan.nextInt();
    	//if (hiz>45) {		
		
    	if (ehliyet==1)
    	{
    		if (hiz<54) {
			System.out.println("cezaya gerek yok");
			
		}
    		if (hiz>=55 && hiz<=74) {
    		System.out.println("Ceza 100 $'dir");
			
		} else if(hiz>=75 && hiz<=84) {
			System.out.println("Ceza 150 $'dir");

		}else if (hiz>=85 && hiz<=94) {
			System.out.println("Ceza 320 $");
			
		}else if (hiz>94) {
			System.out.println("Ceza 500 $");
		}  	
			
		}
    	else{
    		if (hiz<54) {
    			System.out.println("ceza 200 $");
    			
    		}
    		if (hiz>=55 && hiz<=74) {
    		System.out.println("Ceza 300 $'dir");
			
		} else if(hiz>=75 && hiz<=84) {
			System.out.println("Ceza 350 $'dir");

		}else if (hiz>=85 && hiz<=94) {
			System.out.println("Ceza 520 $");
			
		}else if (hiz>94) {
			System.out.println("Ceza 700 $");
		}      

    }
//}else {System.out.println("Hýz limitini geçmediniz.");}
    	}}
