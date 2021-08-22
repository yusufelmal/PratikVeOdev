package day22Tekrar;

import java.util.ArrayList;
import java.util.List;

public class C02_Tekrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Integer> sayilar = new ArrayList <> ();
		
		sayilar.add(10);
		sayilar.add(20);
		
		System.out.println(sayilar.size());
System.out.println(sayilar.isEmpty());

sayilar.add(30);
sayilar.add(40);

System.out.println(sayilar);

System.out.println(sayilar.remove(2));

int silinenEleman = sayilar.remove(2);

System.out.println(sayilar);

System.out.println();
System.out.println(silinenEleman);
System.out.println();
sayilar.remove(1);
System.out.println(sayilar);


List<String> isimler = new ArrayList<>();
isimler.add("Ali");
isimler.add("Ayse");
isimler.add("Zeki");

System.out.println(isimler.remove("Zeki"));
System.out.println(isimler);

isimler.remove("Ayse");

System.out.println(isimler);

boolean sonuc=isimler.remove("Mehmet");

if (sonuc) {
	System.out.println("mehmeti buldum ve sildim");
} else {
	System.out.println("bulamadım ve silemedim");
}

System.out.println(sonuc);
System.out.println(isimler);
isimler.removeAll(isimler);
System.out.println(isimler);
}

}
