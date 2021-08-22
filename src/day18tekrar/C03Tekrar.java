package day18tekrar;

import java.util.Scanner;

public class C03Tekrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Soru 3) Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek
		 * icin 0’a basmasini soyleyin.
		 * 
		 * Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini ve girdigi pozitif
		 * sayilarin toplaminin kac oldugunu yazdirin. kullanici negatif sayi girerse
		 * ignore edin
		 */
		
		double sayi=5;
		int count =0;
		double sayilarToplami=0;
		
		Scanner scan=new Scanner(System.in);
		
		do {
			System.out.println("Lutfen toplamak icin sayilar girin : "); 
			sayi = scan.nextDouble();
			
			if(sayi>0) {
				sayilarToplami += sayi;
				count++;
				
			} else if (sayi<0) {
				System.out.println("pozitif ts giriniz, ignor ettim");
			}
		} while(sayi!=0);
		
		System.out.println("girdiginiz sayilardan " +count+ " adedi pozitifti" + 
		"\nve pozitif sayilarin toplami : " +sayilarToplami);
		scan.close();
	}
	

}
