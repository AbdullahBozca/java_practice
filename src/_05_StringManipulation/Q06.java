package _05_StringManipulation;

import java.nio.file.FileSystemAlreadyExistsException;
import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
       /*
       kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */
    	System.out.println("Email adresini giriniz: ");
    	Scanner scan=new Scanner(System.in);
    	String email=scan.next();
    	
    	if (email.contains("hotmail")) 
			email=email.replaceAll("hotmail", "gmail");
		System.out.println("email adresiniz: "+email);
    }
}
