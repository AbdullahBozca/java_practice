package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01 {

    public static void main(String[] args) {
        /*
         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir program yaziniz
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */
    	ArrayList<String> listIsimler=new ArrayList<String>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
    	ArrayList<String> list2=new ArrayList<String>();
    	System.out.println(listIsimler);
    	for (String a: listIsimler) {
			if (!a.toLowerCase().contains("a")) {
				list2.add(a);
			}
		}
    	System.out.println(list2);
    	


    }


}
