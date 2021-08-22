package replit_forWhileDonguleri;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri
		 * kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
		 * 
		 * char ch1= 'a' ;
		 * 
		 * String name =“John came late"
		 * 
		 * Expected Output:
		 * 
		 * 
		 * Number of a = 2
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("isminizi giriniz");

		String isim = scan.nextLine().toLowerCase();

		System.out.println("bir karakter giriniz : ");

		char karakter = scan.next().toLowerCase().charAt(0);

		int sayac = 0;
		for (int i = 0; i < isim.length(); i++)

			if (isim.charAt(i) == karakter) {

				sayac++;

			}
		System.out.println("icinde gecen karakter sayisi : " +  sayac);
		scan.close();
	}


}
