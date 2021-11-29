package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q08 {

	public static void main(String[] args) {
		/*
		 * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile 8. elemaninin
		 * yerlerini degistirin.
		 *
		 * ORNEK:
		 *
		 * INPUT : String[]
		 * isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan",
		 * "Ahmet","Ali"}; OUTPUT : String[]
		 * isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal",
		 * "Ahmet","Ali"};
		 */
		String arr[] = { "Umit", "Emin", "Kemal", "Kerem", "Taylan", "Orhan", "Sinan", "Furkan", "Ahmet", "Ali" };
		ArrayList<String> names = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			names.add(arr[i]);
		}
		System.out.println(names);
		String yedek = names.get(2);

		names.set(2, arr[7]);
		names.set(7, yedek);
		System.out.println(names);

	}

}
