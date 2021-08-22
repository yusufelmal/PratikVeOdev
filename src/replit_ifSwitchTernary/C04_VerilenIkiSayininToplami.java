package replit_ifSwitchTernary;

import java.util.Scanner;

public class C04_VerilenIkiSayininToplami {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın.
//		Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.
//
//		Ornek:
//
//		INPUT      :  
//
//		25
//
//		46
//
//		OUTPUT :
//
//		Numaralarin Toplami:
//
//		71       

		Scanner scan = new Scanner(System.in);
		System.out.println("give me a number");
		long num1 = scan.nextLong();
		System.out.println("give me another number");
		long num2 = scan.nextLong();
		long sum = num1 + num2;
		if (num1 > 1000000000 || num2 > 1000000000 || sum > 1000000000) {
			System.out.println("overflow");
		} else {
			System.out.println("Numaralarin Toplami " + sum);
		}

		scan.close();
	}

}
