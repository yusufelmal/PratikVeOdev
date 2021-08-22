package day15Tekrar;

import java.util.Scanner;

public class C04_Tekrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("100den kucuk bir sayi veriniz : ");

		int sayi = scan.nextInt();

		for (int i = 1; i < sayi; i++) {

			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		
		scan.close();
	}
}