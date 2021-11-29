package _09_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q18 {

	public static void main(String[] args) {
		// kullanıcıdan alınan bir String'deki herbir karakterin adedini bir array
		// içinde
		// yazdıran bir java programı yazın.
		// String "Javacilar cook afilli" ise cevap şöyle olmalıdır:
		// { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}

		String cumle = "Javacilar cook afilli";
		String cumleArr[] = cumle.split("");
		int sayac = 0;
		System.out.println(Arrays.toString(cumleArr));
		ArrayList<String> list = new ArrayList<String>();
		for (String a : cumleArr) {
			if (!list.contains(a)) {
				list.add(a);
			}
		}
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < cumleArr.length; j++) {
				if (list.get(i).contains(cumleArr[j])) {
					sayac++;
				}
			}
			System.out.print(list.get(i) + "=" + sayac + " ");
			sayac = 0;

		}
		System.out.println();

	}

}
