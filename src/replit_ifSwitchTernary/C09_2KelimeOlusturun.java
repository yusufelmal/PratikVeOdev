package replit_ifSwitchTernary;

import java.util.Scanner;

public class C09_2KelimeOlusturun {

	public static void main(String[] args) {
	
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
     System.out.println("Lutfen iki String isim girin");
     
     String isim1=scan.next();
     String isim2=scan.next();
        
        
        
       if(isim1.length()%2==0) {
           System.out.println(isim1.substring(0,isim1.length()/2) 
                   + isim2 + isim1.substring(isim1.length()/2));
           
       }else {
           
           System.out.println("Ad2, ad1'e eklenemiyor");
       }
		

	}

}
