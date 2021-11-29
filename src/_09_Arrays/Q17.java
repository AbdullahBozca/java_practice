package _09_Arrays;

public class Q17 {
	// Elinizde bir miktar farklı boylarda somun ve bu somunlara uyacak civatalar
	// olsun.
	// Civataları somunlara eşlemek için nasıl bir algoritma yazarsınız.

	public static void main(String[] args) {

		int somun[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int civata[] = { 3, 6, 5, 7, 79, 9, 3, 1, 33 };

		for (int i = 0; i < somun.length; i++) {
			for (int j = 0; j < civata.length; j++) {
				if (somun[i] == civata[j]) {
					System.out.println(somun[i] + " somunu " + civata[j] + " civatası ile eşleşti");
				}
			}
		}
	}

}
