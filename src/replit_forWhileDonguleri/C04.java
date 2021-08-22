package replit_forWhileDonguleri;

import java.util.Scanner;

public class C04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi
		 * yazıniz.
		 * 
		 * Input : 6
		 * 
		 * Output: 6!=6*5*4*3*2*1=720
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("bir tamsayi");

		int tamsayi = scan.nextInt();

		int sonuc = 1;

		System.out.print("Output: " + tamsayi + "!=");

		for (int i = tamsayi; i > 0; i--) {

			sonuc *= i;

			System.out.print(i);

			if (i > 1) {

				System.out.print("*");

			}

		}
		System.out.print("=" + sonuc);

	}

}
