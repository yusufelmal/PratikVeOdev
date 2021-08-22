package privateCodeSharing;

import java.util.Scanner;

public class C01_AsalSayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Asal sayi nedir?
		// Asal sayilar yalniz kendisi ile bölünebilen tüm dogal sayilardir. Asal
		// sayilar yalnizca kendisine ve 1'e bölünebilir. Baska hicbir sayiya
		// bölünemezler.

		Scanner scan = new Scanner(System.in);
		int sayi = scan.nextInt();
		
		System.out.println("Lutfen bir sayi giriniz : ");
		
		if(sayi<2) {
			System.out.println("en kucuk asal sayi 2'dir, lutfen 2 veya daha buyuk bir sayi veriniz.");	
			return;
		} 
		
		
		int sayac=0;
		
		for (int i= 2; i<=sayi; i++) {
			
			
			
			if(sayi%i==0) {
				
				sayac++;
				System.out.println("sayiniz asal degildir");
			} else {
				System.out.println("asaldir");
			}
		}
		
		
		
		
	}

}
