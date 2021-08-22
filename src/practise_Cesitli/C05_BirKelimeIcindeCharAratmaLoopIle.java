package practise_Cesitli;

import java.util.Scanner;

public class C05_BirKelimeIcindeCharAratmaLoopIle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sayac=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir kelime veriniz : ");
		String kelime=scan.nextLine();
		
		System.out.println("Lutfen bir harf veriniz : ");
		char harf= scan.next().charAt(0);
		
		for (int i = 0; i < kelime.length(); i++) {
			
			if (harf==kelime.charAt(i)) {
				
				sayac++;
				
			}
			
		}
		
		System.out.println(sayac);
	}

}
