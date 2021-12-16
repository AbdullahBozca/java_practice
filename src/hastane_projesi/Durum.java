package hastane_projesi;

public class Durum extends VeriBankasi{
	private	String durumlarStr;
	private boolean aciliyet;
	
	
	
	
	public boolean isAciliyet() {
		return aciliyet;
	}
	public void setAciliyet(boolean aciliyet) {
		this.aciliyet = aciliyet;
	}
	public String getDurumlarStr() {
		return durumlarStr;
	}
	public void setDurumlarStr(String durumlarStr) {
		this.durumlarStr = durumlarStr;
	}

}
