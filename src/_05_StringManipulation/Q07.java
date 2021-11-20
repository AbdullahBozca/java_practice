package _05_StringManipulation;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /*
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

    	Scanner scan=new Scanner(System.in);
    	System.out.print("bir isim giriniz :");
    	String isim=scan.nextLine();
    	System.out.println("   ******* if ile *******");
    	
    	char c1=isim.charAt(0);// isimnin ilk harfi
    	char c2=isim.charAt(1);// isimnin ikinci harfi
    	char c3=isim.charAt(2);// isimnin ucuncu harfi
    	
    	if (isim.length()==3) {
    		if (c1!=c2 && c2!=c3 && c1!=c3) {
    			System.out.println("girilen isim 3 harfli ve unique");
    			
    		}else {
    			System.out.println("girilen isim 3 harfli ama unique degil");
    		}
    		
    		
    		
    	}else {
    		System.out.println("girilen isim 3 garfli degil");
    	}
    	System.out.println("   ******* ternary ile *******");
    	
    	String sonuc=isim.length()==3 ? ((c1!=c2 && c2!=c3 && c1!=c3 )? "girilen isim 3 harfli ve unique":"girilen isim 3 harfli ama unique degil")
    	:"girilen isim 3 garfli degil";
    	System.out.println(sonuc);
       
    }
}