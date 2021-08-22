package replit_ifSwitchTernary;

import java.util.Scanner;

public class C07_AdUzunlugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır.
//		Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.
//		 
//		Eger aynı karakterlere sahipse 
//
//		"isim ayni karakterlere sahiptir." yazdirin.
//
//		Eger ayni kaakterlere sahip degilse
//
//		"Dizenin benzersiz karakterleri var" yazdirin. 
//
//		Ternary kullanin.
		
		// kullanicidan bir isim isteyin ve son 2 harfinin 3 kopyasindan olusan yeni bir string yazdirin
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime=scan.next();
        
        int i=kelime.length();
        
        
         
        String kelime1=kelime.substring(i-2,i);
        System.out.println("yeni String :"+  kelime1+kelime1+kelime1);
        
        scan.close();
}
		

	}


