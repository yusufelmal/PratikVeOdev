package day14Tekrar;

import java.util.Scanner;

public class C04_Tekrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("isminizi giriniz : ");
		String isim=scan.next();
		
		isim = ismiDuzelt (isim);
		System.out.println("soyisminizi giriniz : ");
		
		String soyisim=scan.next();
		
		soyisim=ismiDuzelt (soyisim);
		
		
		System.out.println("knonuzu boşluk olmadan giriniz : ");
		String kkNo=scan.next();
		kkNo= kkNoDuzelt(kkNo);
		
		System.out.println(isim+" "+soyisim+"\n" +kkNo);
		scan.close();

	}



	private static String kkNoDuzelt(String kkNo) {
		kkNo=kkNo.replace( " ", "");

		kkNo= kkNo.substring(0,4) + " " + kkNo.substring(4,8) + " " + kkNo.substring(8,12)
		+ " "+ kkNo.substring(12);
		
		return kkNo;
		
	}



	private static String ismiDuzelt(String isim) {
		// TODO Auto-generated method stub
		isim=isim.trim();//isimdeki boşlukları yok ettik
		isim=isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase();	
		return isim;
		
		
	}

}