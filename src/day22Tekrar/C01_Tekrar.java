package day22Tekrar;

import java.util.ArrayList;
import java.util.List;

public class C01_Tekrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> isimler = new ArrayList<>();
		isimler.add("Ali");
		System.out.println(isimler);
		isimler.add("Veli");
		isimler.add("Ayse");
		isimler.add("Fatma");
		isimler.add("Ali");

		isimler.add(3, "Nihan");
		
		isimler.add(0, "Mehmet");
		
		System.out.println(isimler);
		
		
		List <String> yeniList=new ArrayList<>();
		yeniList.add("Firat");
		
		System.out.println(yeniList);
		
		yeniList.addAll(isimler);
		System.out.println(yeniList);
		
		List <Integer> sayilar = new ArrayList<>();
		
		sayilar.add(5);
		
		System.out.println(sayilar);
	}

}
