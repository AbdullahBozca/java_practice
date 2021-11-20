package _05_StringManipulation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        //Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
        // Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
    		System.out.println("3 kelimeden oluşan isminizi giriniz: ");
    		Scanner scan=new Scanner(System.in);
    		String isim=scan.nextLine();
    		
    		String birinciIsim=isim.substring(0, isim.indexOf(" "));
    		String ikinciIsim=isim.substring(isim.indexOf(" ")+1, isim.lastIndexOf(" "));
    		String ucuncuIsım=isim.substring(isim.lastIndexOf(" ")+1);
    		
    		System.out.println(birinciIsim+ikinciIsim+ucuncuIsım);
    		System.out.println(birinciIsim.substring(0,1).toUpperCase()+"."+ikinciIsim.substring(0,1).toUpperCase()
    				+"."+ucuncuIsım.substring(0,1).toUpperCase());
    		
    }       
}
		