package privateCodeSharing;

import java.util.Scanner;

public class DenemeSayfasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir sayi giriniz.");
		int sayi = scan.nextInt();
		int sayac = 0;
		
		if (sayi<2) {
			System.out.println("En kücük asal sayi 2'dir. Yanlis giris yaptiniz.");
			return;
		}
	
		for (int i=2 ; i<sayi ; i++) {
			if (sayi%i == 0) {
				sayac++;
			}
	
		}
			if (sayac == 0) {
				System.out.println("Girdiginiz sayi asal sayidir.");
			} else {
				System.out.println("Girdiginiz sayi asal sayi degildir.");
			}


	}

}
