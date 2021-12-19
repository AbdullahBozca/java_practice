package arac_kiralama;

/*
String alinacakSehir;
String alinacakGun; (MM,dd--> ay gun formatında olmalı)
double alisSaati;
String teslimGunu;  (MM,dd--> ay gun formatında olmalı)
double teslimSaati;
​
​
musterinin ad, soyad, yas, telefon, id  ve kredi kartı bilgileri ile 
  arac tercihine ve islemine gore odemesini gerçekleştriniz..
 */
public class Musteri{
    String ad;
    String soyAd;
    String yas;
    String telefon;
    String id;
    String kartNo;
	String alinacakSehir;
	String alinacakGun;
	String alisSaati;
	String teslimGunu;
	String teslimSaati;
	public Musteri(){
		
	}
	public Musteri(String ad, String soyAd, String yas, String telefon, String id, String kartNo, String alinacakSehir,
			String alinacakGun, String alisSaati, String teslimGunu, String teslimSaati) {
		super();
		this.ad = ad;
		this.soyAd = soyAd;
		this.yas = yas;
		this.telefon = telefon;
		this.id = id;
		this.kartNo = kartNo;
		this.alinacakSehir = alinacakSehir;
		this.alinacakGun = alinacakGun;
		this.alisSaati = alisSaati;
		this.teslimGunu = teslimGunu;
		this.teslimSaati = teslimSaati;
	}
	@Override
	public String toString() {
		return "Musteri [ad=" + ad + ", soyAd=" + soyAd + ", yas=" + yas + ", telefon=" + telefon + ", id=" + id
				+ ", kartNo=" + kartNo + ", alinacakSehir=" + alinacakSehir + ", alinacakGun=" + alinacakGun
				+ ", alisSaati=" + alisSaati + ", teslimGunu=" + teslimGunu + ", teslimSaati=" + teslimSaati + "]";
	}
	
}
