package day17tekrar;

import java.util.Scanner;

public class C06_Tekrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Soru 7 ) Kullanicidan bir sayi alin ve bu sayinin 
		//rakamlari toplamini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir sayi veriniz : ");
		
		int sayi=scan.nextInt();
		
		int i =sayi;
		int rakTop=0;
		int rak=0;
			
	 
		
		
		while (i>0) {
			rak=i%10;
			rakTop+=rak;
			i/=10;
			
			
			
			
			
			
		}
		System.out.println("girdiginiz " +sayi+ " sayisinin rakamlar toplami " +rakTop+"'tur.");
		

	}

}
