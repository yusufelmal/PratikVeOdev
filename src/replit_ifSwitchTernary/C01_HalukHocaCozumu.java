package replit_ifSwitchTernary;

import java.util.Scanner;

public class C01_HalukHocaCozumu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scan = new Scanner(System.in);

	        System.out.println("Boyunuzu cm giriniz : ");
	        double boy =scan.nextDouble()/100;


	        System.out.println("Kilonuzu kg  giriniz : ");
	        double kilo =scan.nextDouble();

	        double bmi = kilo/(boy*boy);
	        if(bmi<=20) {
	            System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Oldukca Zayifsiniz");

	        }else if(bmi>20 && bmi<=25) {
	            System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Normalsınız");

	        }else if(bmi>25 && bmi<=30) {
	            System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Sismansınız");

	        }else if(bmi>30) {
	            System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Obezsiniz");

	        }
	        scan.close();

	}

}
