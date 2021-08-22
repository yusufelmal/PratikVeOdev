package replit_forWhileDonguleri;

import java.util.Scanner;

public class C07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
		 * 
		 * Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi
		 * bir sayı Mükemmel Sayı olarak bilinir.
		 * 
		 * 
		 * Input :
		 * 
		 * 6
		 * 
		 * Output:
		 * 
		 * 6 Mukemmel Sayidir.
		 * 
		 * ======================
		 * 
		 * Input
		 * 
		 * 7
		 * 
		 * Output:
		 * 
		 * 7 Mukemmel Sayidir degildir.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("bir sayi veriniz");

		int sayi = scan.nextInt();

		int toplam = 0;
		for (int i = 1; i < sayi; i++) {

			if (sayi % i == 0) {

				toplam += i;

			}
		}
		if (toplam == sayi) {
			System.out.print(sayi + " mükemmel sayidir");
		} else {
			System.out.print(sayi + " mükemmel değildir");
		}
		scan.close();
	}

}
