package _09_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q18_2 {

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
		
		String cumleTek[]=new String[cumleArr.length];
		for (int i = 0; i < cumleTek.length; i++) {
			cumleTek[i]=cumleArr[i];
		}
		System.out.println(Arrays.toString(cumleTek));
		
		for (int i = 0; i < cumleArr.length; i++) {
			for (int j = 0; j < cumleArr.length; j++) {
				
				if (cumleArr[i].contains(cumleArr[j])) {
					
					sayac++;
				}

			}

			System.out.print(cumleArr[i] + "=" + sayac);
			sayac = 0;
			System.out.println();

		}

	}

}
