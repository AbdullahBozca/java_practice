package _14_Encapsulation.Q01;

public class ArabaMain {

	public static void main(String[] args) {
		
		Araba honda=new Araba();//parametresiz cons.
		honda.setMotor(1300);
		honda.setModel("civic");
		honda.setRenk("kırmızı");
		honda.setYil(2021);
		
		
		
		Araba volvo=new Araba("xc90","beyaz",20,2020);
		Araba vw=new Araba("passat","siyah",1600,-2021);
		System.out.println("seçtiğiniz araç volvo -> "+volvo.getYil()+" "+volvo.getRenk()+" "+volvo.getMotor());
		System.out.println("seçtiğiniz araç vw -> "+vw.getYil()+" "+vw.getRenk()+" "+vw.getMotor());
		
	}

}
