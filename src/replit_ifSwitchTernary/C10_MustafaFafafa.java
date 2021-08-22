package replit_ifSwitchTernary;

import java.util.Scanner;

public class C10_MustafaFafafa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın
//
//		Kullanicidan alinan isim uzunluğu en az 2 olacaktır.
//
//		INPUT   : Mustafa
//
//		OUTPUT  : fafafa

		Scanner scan = new Scanner(System.in);
		System.out.println("bir isim veriniz");
		String isim = scan.next();

		System.out.println(isim.substring(isim.length() - 2, isim.length())
				+ isim.substring(isim.length() - 2, isim.length()) + isim.substring(isim.length() - 2, isim.length()));

	}

}
