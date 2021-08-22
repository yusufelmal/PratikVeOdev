package day17tekrar;

import java.util.Scanner;

public class C05_Tekrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Soru 4) Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden
				// baslayip bitis harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin.
				// Kullanicinin hata yapmadigini farz edin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("baslangic ve bitis harflerini veriniz : ");
		char bas= scan.next().toUpperCase().charAt(0);
		char bit= scan.next().toUpperCase().charAt(0);
		
		char harf=bas;
		while (harf<=bit) {
			System.out.print(harf+" ");
			harf++;
		}
		
				
	}

}
