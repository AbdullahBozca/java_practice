package javaProjects.kitapYonetimi;

public class Kitap {
 private  int no;
 private  String kitapAdi;
 private  String yazarAdi;
 private  int yayinyili;
 private  double fiyat;


    public Kitap(int no, String kitapAdi, String yazarAdi, int yayinyili, double fiyat) {
        this.no = no;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.yayinyili = yayinyili;
        this.fiyat = fiyat;
    }
public Kitap(){

}
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public int getYayinyili() {
        return yayinyili;
    }

    public void setYayinyili(int yayinyili) {
        this.yayinyili = yayinyili;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {//bu method obj fields'ini yazdirir.
        return "Kitap{" +
                "no=" + no +
                ", kitapAdi='" + kitapAdi + '\'' +
                ", yazarAdi='" + yazarAdi + '\'' +
                ", yayinyili=" + yayinyili +
                ", fiyat=" + fiyat +
                '}';
    }
}
