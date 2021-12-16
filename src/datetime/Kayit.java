package datetime;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Kayit {
	ArrayList< Kullanici> kullanicilar=new ArrayList<Kullanici>();
	public ArrayList<Kullanici> kayit() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Adınızı giriniz: ");
		String isim = scanner.nextLine();
		Kullanici kullanıcı = new Kullanici(isim, LocalDateTime.now());
		kullanicilar.add(kullanıcı);
		return kullanicilar;
	}
}
