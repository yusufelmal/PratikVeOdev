package mentoring8Ağustos;

import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		String str1 = scan.nextLine();
		System.out.println(isPalindrome(str1));

	}

	public static boolean isPalindrome(String kelime) {
	        StringBuilder sb = new StringBuilder(kelime);
	        //sb.append(kelime);
	        
	        return kelime.equals(sb.reverse().toString());

	        }

}
