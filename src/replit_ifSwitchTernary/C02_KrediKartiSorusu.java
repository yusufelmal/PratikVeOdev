package replit_ifSwitchTernary;

import java.util.Scanner;

public class C02_KrediKartiSorusu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata
		 * ceviren java kodunu yaziniz.
		 * 
		 * Input :
		 * 
		 * John White
		 * 
		 * 1234234534561478
		 * 
		 * Output : Name :
		 * 
		 * J* W**
		 * 
		 * CCN : ** ** **** 1478
		 * 
		 * Ilk Harfler Buyuk harf ile baslamalidir.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("adinizi giriniz");
		String name = scan.nextLine();

		System.out.println("soyadinizi giriniz: ");
		String surname = scan.next();

		System.out.println("kredi karti nonuzu giriniz");
		String kkno = scan.next();

		System.out.println(name.substring(0, 1).toUpperCase() + name.substring(1).replaceAll("\\w", "*"));

		System.out.println(surname.substring(0, 1).toUpperCase() + surname.substring(1).replaceAll("\\w", "*"));

		System.out.println("**** **** ****" + " " + kkno.substring(12, 16));
		scan.close();

	}

}
