package replit_ifSwitchTernary;

import java.util.Scanner;

public class C01_Bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir
		 * program yazın (BMI)
		 * 
		 * IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)
		 * 
		 * BMI 18,5'in altındaysa zayıfsınız
		 * 
		 * BMI 18,5 ile 25 arasında ise kilonuz idealdir
		 * 
		 * BMI 25-30 arasındaysa şişmansınız
		 * 
		 * BMI 30'dan büyük veya eşitse, obez
		 * 
		 * Input:
		 * 
		 * Output:
		 * 
		 * Agirlik : 71
		 * 
		 * Boy : 1,72
		 * 
		 * BMI : 23.99945916711736
		 * 
		 * Zayifsiniz.
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("kilonuzu yazınız ");
		double kilo = scan.nextDouble();

		System.out.println("boyunuzu yaziniz");
		double boy = scan.nextDouble();

		double BMI = kilo/(boy*boy);
		
		System.out.println(BMI);

		if (BMI < 18.5) {
			System.out.println("zayifsiniz");
		} else if (BMI > 18.5 && BMI < 25) {
			System.out.println("ideal kilodasınz");
		}else if (BMI >= 25 && BMI < 30) {
			System.out.println("ideal kilodasınz");
		} else if (BMI >= 30) {
			System.out.println("obezsiniz");
		}
		scan.close();
	}

}
