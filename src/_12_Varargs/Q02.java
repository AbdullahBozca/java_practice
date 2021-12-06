package _12_Varargs;

import java.util.ArrayList;
import java.util.Arrays;

import javax.print.attribute.IntegerSyntax;

public class Q02 {
	public static void main(String[] args) {
		         // verilen int lerden ilki haric tum sayilari toplayan ve
				// buldugunuz toplam ile ilk sayiyi carpip sonucu yazdiriniz.

		int arr[]= {63,6,8,7,5,2,4,55,6,3,2,7};
		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(63,6,8,7,5,2,4,55,6,3,2,7));
		System.out.println(list);
		Integer arr2[]=new Integer[list.size()];
		arr2=list.toArray(arr2);
		
		//topla(3,list);
	}

	private static void topla(int sayi1,int... sayilar) {
		int toplam=0;
		for (int i : sayilar) {
			toplam+=i;
		}
		System.out.println(sayi1*toplam);
		
		
	}

}
