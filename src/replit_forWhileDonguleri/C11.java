package replit_forWhileDonguleri;

import java.util.Scanner;

public class C11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//kullanicidan istenilen iki sayi arasindaki sayilarin toplamini bulan program yaziniz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("iki sayi giriniz");

		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		int toplam=0;
		
		if (sayi1<sayi2) {
		
		for (int i = sayi1; i <= sayi2; i++) {
			
			toplam+=i;
			
		}
		
		System.out.println(toplam);
		} else {
			for (int i = sayi2; i <= sayi1; i++) {
				
				toplam+=i;
		}
			System.out.println(toplam);
		}
	}

}
