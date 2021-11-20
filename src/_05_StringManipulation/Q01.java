package _05_StringManipulation;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // Kullanıcıdan alacağını bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        System.out.println("String ifade giriniz: ");
        Scanner scan=new Scanner(System.in);
        String deger=scan.nextLine();
        if(deger!="")
        System.out.println(deger.contains(" "));
        // Kullanıcıdan alacağını bir stringin bos olup olmadığını kontrol ediniz.
        else
        	System.out.println("herhangi bir değer girilmedi");
			
    }
}

