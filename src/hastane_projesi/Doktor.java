package hastane_projesi;

public class Doktor extends VeriBankasi {
	private String isim;
	private String unvan;

	

	public Doktor(String isim, String unvan) {
		this.isim = isim;
		this.unvan = unvan;
	}

	public Doktor() {
	}
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getUnvan() {
		return unvan;
	}

	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}

	@Override
	public String toString() {
		return "Doktor [isim=" + isim + ", unvan=" + unvan + "]";
	}

}
