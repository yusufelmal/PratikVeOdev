package day14Tekrar;

import java.util.Scanner;

public class C01_Tekrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan=new Scanner(System.in);
System.out.println("lütfen bir tam sayi yaziniz: ");

int sayi=scan.nextInt();

tekcift(sayi);
sifirkubu(sayi);
yazdir(sayi);




	}

	private static void yazdir(int sayi) {
		// TODO Auto-generated method stub
		if (sayi<100) {
			System.out.println("birler basamagi : " +(sayi%10));
		} else  {
			int rakTop=0;
			int rak=0;
			
			rak=sayi%10;
			rakTop+=rak;
			sayi/=10;
			
			rak=sayi%10;
			rakTop+=rak;
			sayi/=10;
			
			rak=sayi%10;
			rakTop+=rak;
			sayi/=10;
			
			System.out.println(rakTop);
		}
		
	}

	private static void sifirkubu(int sayi) {
		// TODO Auto-generated method stub
		if (sayi<0) {
			System.out.println("negatif");
		} else if (sayi>0){
			System.out.println("pozitif");
		} else {
			System.out.println("sıfır");
		}
		
	}

	private static void tekcift(int sayi) {
		// TODO Auto-generated method stub
		if (sayi%2==0) {
			System.out.println("cift");
		} else {
			System.out.println("tek");
		}
		
	}

}
