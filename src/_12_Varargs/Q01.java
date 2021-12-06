	package _12_Varargs;

import java.lang.invoke.StringConcatException;
import java.util.Scanner;

public class Q01 {
	public static void main(String[] args) {
		//  verilen Stringleri birlestiren concat isimli bir method olusturunuz
		// input : "m", "e", "r", "v", "e";
		// output : merve

		
		concat("a","b","d","u","l","l","a","h");
		
		
	}
	public static void concat(String... str) {
		String yeniStr="";
		for (String w : str) {
			yeniStr=yeniStr.concat(w);
		}
		System.out.println(yeniStr);
	}
}
