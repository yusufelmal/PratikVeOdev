package replit_ifSwitchTernary;

import java.util.Scanner;

public class C04_OgrenciCozumu {

public static void main(String[] args) {
	


		/*Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın.
		Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.
		Ornek:
		INPUT      :  
		25
		46
		OUTPUT :
		Numaralarin Toplami:
		71
		         
		         */
		        
	     Scanner scan = new Scanner(System.in);
	        long sayi1, sayi2;
	        int count1 = 0;
	        do {
	            if (count1 > 0) {
	                System.out.println("Lutfen 0'dan buyuk bir tamsayi giriniz");
	            } else {
	                System.out.println(
	                        "Simdi toplamak uzere sifirdan buyuk iki tam sayi gireceksiniz.Lutfen ilk tamsayiyi giriniz");
	            }
	            count1++;
	            sayi1 = scan.nextLong();
	        } while (sayi1 <= 0);
	        int count2 = 0;
	        do {
	            if (count2 > 0) {
	                System.out.println("Lutfen 0'dan buyuk bir tamsayi giriniz");
	            } else {
	                System.out.println("Lutfen ikinci tamsayiyi giriniz");
	            }
	            count2++;
	            sayi2 = scan.nextLong();
	        } while (sayi2 <= 0);
	        if (sayi1 + sayi2 > 1000000000) {
	            System.out.println("OverFlow");
	        } else {
	            System.out.println(sayi1 + sayi2);
	        }
	        scan.close();
		    
		        
	}

}
