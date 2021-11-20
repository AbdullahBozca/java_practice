package _04_switchCase;

import java.util.Scanner;

public class Soru_Bankamatik {

    public static void main(String[] args) {

        System.out.println("*****************************");
        System.out.println("ATM'ye Hoşgeldiniz...");

        String islemler = "1.İşlem : Bakiye Öğrenme\n2.İşlem : Para Yatırma\n"
                + "3.İşlem : Para Çekme\n"
                + "4.İşlem : Çıkış";

        System.out.println(islemler);
        System.out.println("*****************************");

        int bakiye = 1000;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
        String islem = scanner.nextLine();

        switch (islem) {
            case "1":
                System.out.println("Bakiyeniz: " + bakiye);
                break;

            case "2":
                System.out.print("Yatırmak istediğiniz tutarı girin: ");

                int tutar = scanner.nextInt();

                bakiye += tutar;

                System.out.println("Yeni bakiyeniz: " + bakiye);
                break;


            case "3":
                System.out.print("Çekmek istediğiniz tutarı girin: ");
                int tutar2 = scanner.nextInt();


                if (tutar2 <= bakiye) {
                    bakiye -= tutar2;
                    System.out.println("Yeni bakiyeniz: " + bakiye);
                } else {
                    System.out.println("Yeterli bakiyeniz yok...");
                }
                break;

            case "4":
                System.out.println("Çıkış yapılıyor...");
                break;
            default:
                System.out.println("Geçersiz işlem...");
                break;
        }

    }
}

