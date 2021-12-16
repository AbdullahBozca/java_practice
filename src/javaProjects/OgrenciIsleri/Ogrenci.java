package javaProjects.OgrenciIsleri;

import java.util.ArrayList;
import java.util.Arrays;

public class Ogrenci {
	private int ogrNo;
	private String ogrAdi;
	
	public Ogrenci(int ogrNo, String ogrAdi) {
		super();
		this.ogrNo = ogrNo;
		this.ogrAdi = ogrAdi;
		
	}

	public Ogrenci() {
	}

	public int getOgrNo() {
		return ogrNo;
	}

	public void setOgrNo(int ogrNo) {
		this.ogrNo = ogrNo;
	}

	public String getOgrAdi() {
		return ogrAdi;
	}

	public void setOgrAdi(String ogrAdi) {
		this.ogrAdi = ogrAdi;
	}

	@Override
	public String toString() {
		return "Ogrenci [ogrNo=" + ogrNo + ", ogrAdi=" + ogrAdi + "]";
	}

	
}
