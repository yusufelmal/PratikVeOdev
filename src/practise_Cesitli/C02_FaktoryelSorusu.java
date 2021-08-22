package practise_Cesitli;

import java.util.Scanner;

public class C02_FaktoryelSorusu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		int num=scan.nextInt();
		int product=1;
		System.out.print(num+"!=");
		for (int i = 1; i <= num; i++) {
			product*=i;
			System.out.print("*"+i);
		}
		System.out.println("="+product);
	scan.close();
	}

}
