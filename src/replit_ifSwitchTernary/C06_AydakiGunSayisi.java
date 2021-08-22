package replit_ifSwitchTernary;

import java.util.Scanner;

public class C06_AydakiGunSayisi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.
//
//		INPUT:
//		        
//		Ay Numarasi: 
//
//		2
//
//		Yil : 
//
//		2016
//
//		OUTPUT  :
//
//		Subat 2016 29 Gundur.

		String ayAdi = "x";
		int gunSayi = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("ay numarasını 1den 12 ye kadar veriniz");

		int ayNo = scan.nextInt();

		System.out.println("yili rakam olarak veriniz");

		int yil = scan.nextInt();

		switch (ayNo) {
		case 1:
			ayAdi = "Ocak";
			gunSayi = 31;
			break;
		case 2:
			ayAdi = "Şubat";
			if (yil % 400 == 0 || (yil % 100 != 0 && yil % 4 == 0)) {
				gunSayi = 29;
			} else {
				gunSayi = 28;
			}
			break;
		case 3:
			ayAdi = "Mart";
			gunSayi = 31;
			break;
			
		case 4:
			ayAdi = "Nisan";
			gunSayi= 30;
			break;
		case 5:
			ayAdi="Mayis";
			gunSayi=31;
			break;
			
		case 6:
			ayAdi="Haziran";
			gunSayi=30;
			break;
			
		case 7:
			ayAdi="Temmuz";
			gunSayi=31;
			break;
			
		case 8:
			ayAdi="Ağustos";
			gunSayi=31;
			break;
		case 9:
			ayAdi="Eylül";
			gunSayi=30;
			break;
		case 10:
			ayAdi="Ekim";
			gunSayi=31;
			break;
		case 11:
			ayAdi="Kasım";
			gunSayi=30;
			break;
		case 12:
			ayAdi="Aralik";
			gunSayi=31;
			break;
			
		default:
			System.out.println("lutfen gecerli bir ay degeri giriniz");
			
			
			
			
//			Subat 2016 29 Gundur.
		}
		System.out.println(ayAdi + " "+ yil + " "+ gunSayi+ " Gundur.");
		
	}

}
