package mentoring8Ağustos;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Iki String palindrome mi degil mi kontrol method kullanarak yapin. Stringin
		// ters cevrilmis hali ile esitligi
		// Ornegin kutuk 12321 ey edip adanada pide ye Reverse String

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen bir string giriniz");

		String str = scan.nextLine();

		String str2 = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			str2 += str.charAt(i);

		}
		if (str.equals(str2)) {
			System.out.println("Palindrom");
		} else {
			System.out.println("Palindrom degildir");
		}

	}

}
