package _11_dateTime.HaftaninSorusu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit {

    List<Kullanici> kisiler = new ArrayList<>();//bos list
   public List<Kullanici> kayitAl(){
       Scanner scan = new Scanner(System.in);
       System.out.print("adinizi giriniz : ");
       String isim=scan.nextLine();

       Kullanici user=new Kullanici(isim, LocalDateTime.now());
       kisiler.add(user);
       return kisiler;
   }
  public void sansliKull(List<Kullanici> kull){
       for(Kullanici each : kull){
           if (each.kayitZamani.getSecond()<10) {
               System.out.println("sansli kisisiniz "+each.name+" agam 5 kilo bal kazandin");
           }else System.out.println("maalesef "+each.name+"ballar balını buldunuz kovanınız yagmalandi");
       }
  }
  public  void  listele(List<Kullanici> kul){
       for(Kullanici each : kul){
           System.out.println("Adi :"+each.name+" kayit zamani : "+each.kayitZamani);
       }
  }
}
