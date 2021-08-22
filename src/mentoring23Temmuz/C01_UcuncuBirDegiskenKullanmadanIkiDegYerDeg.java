package mentoring23Temmuz;

import java.util.Scanner;

public class C01_UcuncuBirDegiskenKullanmadanIkiDegYerDeg {
	public static void main(String[] args) {

		// - [ ] 2 - Ucuncu bir degisken kullanmadan iki degiskenin degerlerini
		// degistirme - Yusuf Bey

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen iki sayi veriniz");

		int a = scan.nextInt();
		int b = scan.nextInt();

		System.out.println("ilk sayiniz: " + a + " ikinci sayiniz : " + b);

		
		  a=a+b; 
		  
		  b=a-b; 
		  
		  a=a-b;
		  
		 
		 
	/*	
		a=a+b;
		b=a-b;
		a=a-b;
		/*
		int temp = 0;

		
		 * temp=a+b; b= temp-b; a=temp-a;
		 */

		/*
		 * temp = b; b=a; a=temp;
		 */
/*
		int temp=0;
	
		temp = a + b;
		
		a = temp - a;
		
	
		
		b = temp - b;
		*/

		System.out.println("yeni ilk sayiniz: " + a + " yeni ikinci sayiniz : " + b);

	}
}
