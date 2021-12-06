package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Convert_binary {
	public static void main(String[] args) {
		//Girilen desimal değeri binary değere çeviren metodu oluşturunuz.
		Scanner scanner=new Scanner(System.in);
		int desimal=scanner.nextInt();
		binaryCevir(desimal);
		scanner.close();
		
	}

	private static void binaryCevir(int desimal) {
		ArrayList<Integer> binary=new ArrayList<Integer>();
		while (desimal>=1) {
			binary.add(desimal%2);
			desimal/=2;
		}
		for (int i = binary.size()-1; i >=0; i--) {
			System.out.print(binary.get(i));
		}
		
	}
}
