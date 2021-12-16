package javaProjects.kitapYonetimi;

import java.util.List;
import java.util.Scanner;

public class KitapMethod {
    static Scanner scan = new Scanner(System.in);
    static int kitapNo = 1000;
    public static void menu(List<Kitap> liste) {//
        System.out.println("========= KİTAP PROGRAMI =============\n1: Kitap ekle\n2: Numara ile kitap sil\n3: " +
                "Tum kitaplari listele\n4: Bitir");

        System.out.print("isleminizi seciniz : ");
        int tercih = scan.nextInt();
        switch (tercih) {
            case 1:
                kitapEkle(liste);
                break;
            case 2:
                noIleSil(liste);
                break;
            case 3:
                listele(liste);
                break;
            case 4:
                bitir();
                break;
            default:
                System.out.println("yanlis giris yapildi tekrar deneyiniz !!!");
                break;
        }

    }

    public static void listele(List<Kitap> liste) {
        for (Kitap k : liste) {
            System.out.println(k.toString());

        }
        menu(liste);
    }

    private static void noIleSil(List<Kitap> liste) {
        System.out.print("silinecek kitap nogiriniz : ");
        int silinecekNo = scan.nextInt();
        for (Kitap k : liste) {
            if (k.getNo() == silinecekNo) {
                liste.remove(k);
                menu(liste);
            }

        }

        System.out.println(silinecekNo + " ait kitap bulunamadi !!!");
        menu(liste);
    }
    public static void kitaplarEkle(List<Kitap> liste) {
        Kitap kitap1 =new Kitap(++kitapNo,"sefiller","victor hugo",1890,100);
        Kitap kitap2 =new Kitap(++kitapNo,"serenad","falan filan",1999,220);
        Kitap kitap3 =new Kitap(++kitapNo,"insan ne ile yasar","victor hugo",2000,150);
        Kitap kitap4 =new Kitap(++kitapNo,"korler","benim kitabım",2010,130);
        Kitap kitap5 =new Kitap(++kitapNo,"ebik gabık","kudret narı",2011,90);
        Kitap kitap6 =new Kitap();



        liste.add(kitap1);
        liste.add(kitap2);
        liste.add(kitap3);
        liste.add(kitap4);
        liste.add(kitap5);
    }

    private static void kitapEkle(List<Kitap> liste) {
        System.out.println("Kitap ismi giriniz : ");
        scan.nextLine();//dummy --> kukla Bos scan obj
        String kitapAdi = scan.nextLine();
        //scan.nextLine();//dummy --> kukla Bos scan obj
        System.out.println("Kitabin yazar  ismi giriniz : ");

        String yazarAdi = scan.nextLine();
        System.out.println("yayin yilini giriniz : ");
        int yayinyili = scan.nextInt();
        System.out.println("fiyatini giriniz : ");
        double fiyat = scan.nextDouble();
        Kitap kitap = new Kitap(++kitapNo, kitapAdi, yazarAdi, yayinyili, fiyat);//kitap obj create edildi
        liste.add(kitap);
        System.out.println(kitap.toString() + " eklendi  :) ");
        menu(liste);
    }

    private static void bitir() {
        System.out.println("yine bekleriz....");
    }

}
