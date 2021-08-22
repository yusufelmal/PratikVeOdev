package replit_forWhileDonguleri;

import java.util.Scanner;

public class C02_ObebOkek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("iki sayi giriniz: ");

		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();

		int obeb = 1;
		int okek = 1;

		for (int i = 1; i <= sayi1 && i <= sayi2; i++) {
			if (sayi1 % i == 0 && sayi2 % i == 0) {
				obeb = i;
			}

		}

		okek = sayi1 * sayi2 / obeb;

		System.out.println(obeb);
		System.out.println(okek);

		scan.close();

	}

}
