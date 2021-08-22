package replit_ifSwitchTernary;

import java.util.Scanner;

public class C09_KendiCozumum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
        2 kelime oluşturun: isim1 ve isim2
        name1 çift sayıda karakter içeriyorsa,
        sonra ikinci kelimeyi ilk adın ortasına yerleştirin
        ilk kelimenin tek sayıları varsa
        Ardından “Ad2, ad1'e eklenemiyor” yazdırın.
        Örneğin:
        isim1 = mehmet
        isim2= ahmet
        Yazdır ==> mehahmetmet 
        
        */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir isim veriniz: ");
		String name1=scan.next();
		System.out.println("bir isim daha veriniz: ");
		String name2=scan.next();
		
		if(name1.length()%2==0) {
			System.out.println(name1.substring(0, name1.length()/2) + name2 + name1.substring(name1.length()/2));
			
		} else {
			System.out.println("Ad2, ad1'e eklenemiyor");
		}
		
		
	}

}
