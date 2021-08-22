package replit_forWhileDonguleri;

import java.util.Scanner;

public class C03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * Bir String icerisinde yinelenen karakterleri döndüren bir kod
		 * yazıniz.(mülakat Sorusu)
		 * 
		 * Input :
		 * 
		 * String str=“Javaisalsoeasy”
		 * 
		 * Output: a s
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir string giriniz.");
		String str = scan.nextLine();

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) { // i+1 o index haric hepsiyle karsilastirma yapiyor..
				if (str.charAt(i) == str.charAt(j)) {
					System.out.print(str.charAt(j) + " ");

				}

			}

		}
	}
}
