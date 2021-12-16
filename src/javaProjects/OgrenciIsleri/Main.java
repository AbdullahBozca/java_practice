package javaProjects.OgrenciIsleri;

import java.util.ArrayList;
import java.util.List;

public class Main {
	static ArrayList<Ogrenci> ogrListe = new ArrayList<Ogrenci>();
	static ArrayList<OgrenciNot> notListe=new ArrayList<OgrenciNot>();

	public static void main(String[] args) {
		OgrenciMethod.menu(ogrListe, notListe);
	}

}
