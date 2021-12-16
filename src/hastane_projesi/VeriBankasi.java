package hastane_projesi;

import java.util.ArrayList;
import java.util.Arrays;

public class VeriBankasi {
	private ArrayList<String> doktorİsimleri=new ArrayList<String>();
	private ArrayList<String> unvanlar=new ArrayList<>(Arrays.asList("1-Allergist", "2-Norolog", "3-Genel cerrah", "4-Cocukdoktoru", "5-Dahiliye", "6-Kardiolog" ));
	private	ArrayList<String> hastaİsimleri=new ArrayList<String>();
	private ArrayList<String> durumlar=new ArrayList<String>(Arrays.asList("1-Allerji", "2-Bas agrisi", "3-Diabet", "4-Sogukalginligi", "5-Migren", "6-Kalphastaliklari"));
	static	int hastaId;
	public ArrayList<String> getDoktorİsimleri() {
		return doktorİsimleri;
	}
	public void setDoktorİsimleri(String doktorİsimleri) {
		this.doktorİsimleri.add(doktorİsimleri) ;
	}

	public ArrayList<String> getHastaİsimleri() {
		return hastaİsimleri;
	}
	public void setHastaİsimleri(ArrayList<String> hastaİsimleri) {
		this.hastaİsimleri = hastaİsimleri;
	}
	
	public static int getHastaId() {
		return hastaId;
	}
	public static void setHastaId(int hastaId) {
		VeriBankasi.hastaId = hastaId;
	}
	
	public ArrayList<String> getUnvanlar() {
		return unvanlar;
	}
	public void setUnvanlar(ArrayList<String> unvanlar) {
		this.unvanlar = unvanlar;
	}
	public ArrayList<String> getDurumlar() {
		return durumlar;
	}
	public void setDurumlar(ArrayList<String> durumlar) {
		this.durumlar = durumlar;
	}
	public void setDoktorİsimleri(ArrayList<String> doktorİsimleri) {
		this.doktorİsimleri = doktorİsimleri;
	}
	
}
