package _05_StringManipulation;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
    /*
        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str 1= %13.99
        String str 2= %10.55
        ipucu: Double.parseDouble() methodunu kullanabilirsiniz.

     */
    	String  str1= "%13.99";
    	String str2= "%10.55";
    	str1=str1.substring(1);
    	str2=str2.substring(1);
    	double sayi1=Double.parseDouble(str1);
    	double sayi2=Double.parseDouble(str2);
    	System.out.println("sayıların toplamı: "+(sayi1+sayi2));
      
    }
}
