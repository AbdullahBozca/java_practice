package hastane_projesi;

import java.util.Arrays;

public class Hasta extends VeriBankasi {
	private int hastaNo;
	private String hastaAdi;
	private String durumStr;
	private boolean aciliyet;

	public Hasta(int hastaNo, String hastaAdi, String durumStr, boolean aciliyet) {

		this.hastaNo = hastaNo;
		this.hastaAdi = hastaAdi;
		this.durumStr = durumStr;
		this.aciliyet = aciliyet;
	}

	public Hasta() {
	}

	public String getHastaAdi() {
		return hastaAdi;
	}

	public void setHastaAdi(String hastaAdi) {
		this.hastaAdi = hastaAdi;
	}

	public int getHastaNo() {
		return hastaNo;
	}

	public boolean isAciliyet() {
		return aciliyet;
	}

	public void setAciliyet(boolean aciliyet) {
		this.aciliyet = aciliyet;
	}

	public void setHastaNo(int hastaNo) {
		this.hastaNo = hastaNo;
	}

	public String getDurumStr() {
		return durumStr;
	}

	public void setDurumStr(String durumStr) {
		this.durumStr = durumStr;
	}

	@Override
	public String toString() {
		return "Hasta [hastaNo=" + hastaNo + ", hastaAdi=" + hastaAdi + ", durumStr=" + durumStr + ", aciliyet="
				+ aciliyet + "]";
	}

}
