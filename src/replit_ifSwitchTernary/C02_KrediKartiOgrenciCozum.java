package replit_ifSwitchTernary;

import java.util.Scanner;

public class C02_KrediKartiOgrenciCozum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen 
         * formata ceviren java kodunu yaziniz.
        Input : 
        John White
        1234234534561478
        Output : Name : 
        J** W*
        CCN  : ** ** ** 1478
        * Ilk Harfler Buyuk harf ile baslamalidir.
        */
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim=scan.next();
        System.out.println("Lutfen soyisminizi giriniz ");
        String soyisim=scan.next();
        System.out.println("lutfen kart numaranizi giriniz");
        String kkNo=scan.next();
 
        
        String isimDuzenlenmis=isim.substring(0,1).toUpperCase() 
                + isim.substring(1).replaceAll("\\w", "*");
        
        String soyisimDuzenlenmis=soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");
        
                String kkNoDuzenlenmis="**** **** ****" +" "+kkNo.substring(12,16);
        
        System.out.println(isimDuzenlenmis);
        System.out.println(soyisimDuzenlenmis);
        System.out.println(kkNoDuzenlenmis);
    }
}


       