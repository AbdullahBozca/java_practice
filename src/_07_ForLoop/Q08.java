package _07_ForLoop;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        // Kullanicidan bir String isteyin. Kullanicinin girdigi
        // String’in palindrome olup olmadigini kontrol eden bir program yazin.
    	Scanner scan=new Scanner(System.in);
    	String kelime=scan.next();
    	String tersKelime="";
    	for (int i = kelime.length()-1; i >=0; i--) {//kale 
			tersKelime+=kelime.charAt(i);
		}
    	if (kelime.contains(tersKelime)) {// burada kelime ile terskelimenin aynı olup olmasığını
			System.out.println("girilen kelime palindrom");
		}else
			System.out.println("girilen kelime palindrom değil");
    	


    }

}

