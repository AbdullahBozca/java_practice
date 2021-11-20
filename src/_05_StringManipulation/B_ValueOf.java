package _05_StringManipulation;

public class B_ValueOf {
    public static void main(String[] args) {
        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
        // Stringlerle matematiksel islemler yapabilmemizi saglar.

        //valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
        //olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.

        String paraErkek = "1900";
        String paraKadin = "2000";

        //Bu ailenin toplam gelirini bulunuz.
        System.out.println(paraErkek + paraKadin);//19002000
        System.out.println(Integer.valueOf(paraErkek) + Integer.valueOf(paraKadin));//3900

        int maasErkek = 1900;
        int maasKadin = 2000;

        //maasErkek ve maasKadin sayilarini String'e donusturn ve concatenation yapin
        System.out.println(maasErkek + maasKadin);//3900
        System.out.println(String.valueOf(maasErkek) + String.valueOf(maasKadin));//19002000



        String girilenKelime = "65"; // su haliyle ahmet gibi bir kelimedir.sayisal isleme giremez
        int girilenSayi=65;

        // kelimenin -> sayiya cevrilmesi
        int girilenKelimeninSayiHali = Integer.parseInt(girilenKelime); // donusecek tipe uygun donusum
        short shortDeger = Short.parseShort(girilenKelime);
        double oran = Double.parseDouble(girilenKelime);

        // sayinin -> kelimeye cevrilmesi
        String girilenSayininKelimeHali = Integer.toString(girilenSayi); // degiskenin tipine uygun donusum
        String kelimeOran = Double.toString(oran);
        // Soru : Short olarak atadığınız değeri stringe çevirerek,
        // ekrana yazdırınız.




        //toString() methodu;
        short sayi=345;
        String strSayi = Short.toString(sayi);

        System.out.println("strSayi = " + strSayi);
        System.out.println("Short.toString(sayi) = " + Short.toString(sayi));



        //Soru:  String olarak verilen 2 adet bagis parasının toplamini yazdiriniz.

        String bagis1="500";
        String bagis2="1500";

        int intBagis1= Integer.parseInt(bagis1);
        int intBagis2= Integer.parseInt(bagis2);

        int toplam = intBagis1 + intBagis2;
        //int toplam = Integer.parseInt(bagis1) + Integer.parseInt(bagis2) ;

        System.out.println("toplam = " + toplam);



        // Soru :String olarak verilen karenin 1 kenar uzunluğundan
        // karenin çevresinin uzunluğunu bulunuz.

        String kenar="8";

        int intKenar= Integer.parseInt(kenar);

        int cevre = intKenar + intKenar + intKenar +intKenar ;

        System.out.println("cevre = " + cevre);
    }
}
