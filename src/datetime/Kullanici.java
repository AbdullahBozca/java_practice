package datetime;

import java.time.LocalDateTime;

public class Kullanici {
	String isim; // instance variable
	LocalDateTime giristarihi;
	public Kullanici(String isim, LocalDateTime giristarihi) {
		super();
		this.isim = isim;
		this.giristarihi = giristarihi;
	}
	public Kullanici() {}
}
