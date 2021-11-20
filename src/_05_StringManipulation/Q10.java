package _05_StringManipulation;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        /*

         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
         */

		 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */
    	System.out.println("İsminizi giriniz: ");
    	Scanner scan=new Scanner(System.in);
    	String isim=scan.next();
    	System.out.println("Soyisminizi giriniz: ");
    	String soyIsim=scan.next();
    	System.out.println("Kredi kartı numarası giriniz: ");
    	String kkNo=scan.next();
    	
    	isim=isim.substring(0, 1).toUpperCase()+isim.substring(1).replaceAll("\\w", "*");
    	soyIsim=soyIsim.substring(0, 1).toUpperCase()+soyIsim.substring(1).replaceAll("\\w", "*");
    	System.out.println(isim);
    	System.out.println(soyIsim);
    	
    	if (kkNo.length()>16) 
    		System.out.println("geçersiz kart no!!!");
    	else if (kkNo.length()<16)
    		System.out.println("geçersiz kart no!!!");
    	else
    		System.out.println(kkNo.substring(0, 4).replaceAll("\\w", "*")+" "+kkNo.substring(4,8).replaceAll("\\w", "*")
    				+" "+kkNo.substring(8,12).replaceAll("\\w", "*")+" "+kkNo.substring(12));
    }
}
