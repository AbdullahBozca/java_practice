package _05_StringManipulation;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*
				StringMethods:
				cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    	    ORNEK:
		     	INPUT      :  Python
				OUTPUT :   Pyt
	    */
    	System.out.println("bir kelime giriniz: ");
    	Scanner scan=new Scanner(System.in);
    	String kelime=scan.next();
    	
    	if (kelime.length()%2==0) 
    		System.out.println(kelime.substring(0,kelime.length()/2));
    	else
    		System.out.println("kelimenin uzunluk değeri tek");
    }
}
