package day14Tekrar;

import java.util.Scanner;

public class C03_Tekrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Soru 3) Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre - @
		 * isareti icermiyorsa gecersiz email yazdirin - @gmail.com icermiyorsa “lutfen
		 * gmail adresinizi girin” yazdirin - @gmail.com ile bitmiyorsa “Yazimda bir
		 * sorun var, maili kontrol ediniz” Bu sorunlardan hic biri yoksa
		 * "email adresiniz basariyla kaydedildi" yazdirin
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen e mail adresinizi giriniz : ");
		String email = scan.next();

		emailKontrol(email);
scan.close();
	}

	private static void emailKontrol(String email) {
		if(!email.contains("@")) {
			System.out.println("gecersiz e mail");
		} else if (!email.contains("@gmail.com")) {
			System.out.println("lutfen gmail adresinizi giriniz");
		} else if (!email.endsWith("@gmail.com")) {
		System.out.println("yazimdaki soruna bakiniz");
		} else {
		System.out.println("her sey perfekt, kaydettik");
		}

}

}
