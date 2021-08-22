package replit_forWhileDonguleri;

import java.util.Scanner;

public class C09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)
		Input  :1238
		Output :Girilen Numananin Tersi: 8321
		
		*/
		
		Scanner scan =  new Scanner (System.in);
		
		System.out.println("bir sayi veriniz");
		
		String sayi=scan.nextLine();
		
		
		for (int i =sayi.length()-1 ; i>=0 ; i--) {
			
			System.out.print(sayi.charAt(i));
			
		}
		
		scan.close();
		
	}

}
