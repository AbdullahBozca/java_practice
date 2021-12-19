package arac_kiralama;
/*
 String marka; (liste araclari --> opel toyota volvo)
String model;  (astra corolla s60)
String yakitTipi;  (diesel benzin)
String vites; (manuel otomatik)
double gunlukUcret; ( 100 120 150... liste dısı arac=300)
 */

public class AracDepo {
	private int aracNo;
	private String marka;
	private String model;
	private String yakitTipi;
	private String vites;
	private double gunlukUcret;

	public AracDepo() {

	}

	public AracDepo(int aracNo, String marka, String model, String yakitTipi, String vites, double gunlukUcret) {
		super();
		this.aracNo = aracNo;
		this.marka = marka;
		this.model = model;
		this.yakitTipi = yakitTipi;
		this.vites = vites;
		this.gunlukUcret = gunlukUcret;
	}

	public int getAracNo() {
		return aracNo;
	}

	public void setAracNo(int aracNo) {
		this.aracNo = aracNo;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYakitTipi() {
		return yakitTipi;
	}

	public void setYakitTipi(String yakitTipi) {
		this.yakitTipi = yakitTipi;
	}

	public String getVites() {
		return vites;
	}

	public void setVites(String vites) {
		this.vites = vites;
	}

	public double getGunlukUcret() {
		return gunlukUcret;
	}

	public void setGunlukUcret(double gunlukUcret) {
		this.gunlukUcret = gunlukUcret;
	}

	@Override
	public String toString(){
		return "AracDepo [aracNo=" + aracNo + ", marka=" + marka + ", model=" + model + ", yakitTipi=" + yakitTipi
				
				+ ", vites=" + vites + ", gunlukUcret=" + gunlukUcret + "]\n";
	}}
