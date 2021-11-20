package _05_StringManipulation;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        // ad ayrı soyad ayrı sekilde ekrana yazdırınız.
    	System.out.println("İsminizi ve soyisminizi arada bir boşluk bırakarak yazınız: ");
    	Scanner scan=new Scanner(System.in);
    	String isimSoyisim=scan.nextLine();
    	String isim=isimSoyisim.substring(0, isimSoyisim.indexOf(" ")+1);
    	String soyIsim=isimSoyisim.substring(isimSoyisim.indexOf(" "));
    	System.out.println("İsminiz: "+isim+"\nSoyisminiz: "+soyIsim);
    }
}
