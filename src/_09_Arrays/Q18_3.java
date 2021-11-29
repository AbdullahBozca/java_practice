package _09_Arrays;

import java.util.Arrays;

public class Q18_3 {

	public static void main(String[] args) {
		// kullanıcıdan alınan bir String'deki herbir karakterin adedini bir array
		// içinde yazdıran bir java programı yazın.
		// String "Javacilar cook afilli" ise cevap şöyle olmalıdır:
		// { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}

		String cumle = "Javacilar cook afilli";
		String cumleArr[] = cumle.split("");
		System.out.println(Arrays.toString(cumleArr));
		String cumleAranacak[] = new String[cumleArr.length];
		for (int i = 0; i < cumleArr.length; i++) {
			if (i != 0) {
				for (int j = i; j <= 0; j--) {
					if (j != 0) {

						if (!cumleArr[i].contains(cumleArr[j - 1])) {
							cumleAranacak[i]=cumleArr[j];
						}
					}
				}
			} else
				cumleAranacak[0] = cumleArr[0];
		}
		System.out.println(Arrays.toString(cumleAranacak));
	}

}
