package day13Tekrar;

import java.util.Scanner;

public class C2_Tekrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        // Kullanicidan 2 tamsayi isteyin
        // bu sayilarin toplamlarini ve carpimlarini 
        // iki ayri method'da hesaplayip yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("iki sayi veriniz bitte: ");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		toplam(sayi1,sayi2);
		carpim(sayi1,sayi2);
		carpim(sayi1+3,sayi2*2);
		
		sayi1=20;
		sayi2=15;
		
		toplam(sayi1,sayi2);
		carpim(sayi1,sayi2);
		scan.close();
	}

	private static void carpim(int sayi1, int sayi2) {
		// TODO Auto-generated method stub
		
		System.out.println("carpim = " +sayi1*sayi2);
		
	}

	private static void toplam(int sayi1, int sayi2) {
		// TODO Auto-generated method stub
		System.out.println("toplam = " +(sayi1+sayi2));
		
		
	}
	
}
