package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {


    /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)

         Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiriniz
       input : Learning java is easy
       output: maximumCounts occurring character is : a
        */
    	String cumle = "Learning java is easy";
		String arr[] = cumle.split("");
		int count = 0;
		int enCok = 0;
		char enCokHarf = ' ';
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].contains(arr[j])) {
					count++;
				}

			}
			if (count > enCok) {
				enCok = count;
				enCokHarf = arr[i].charAt(0);
			}
			count = 0;
		}
		System.out.println("maximum occurring character is : "+enCokHarf);
    }
}

