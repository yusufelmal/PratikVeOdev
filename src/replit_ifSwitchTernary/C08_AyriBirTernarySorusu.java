package replit_ifSwitchTernary;

import java.util.Scanner;

public class C08_AyriBirTernarySorusu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        /*
		         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
		         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz.
		         * 
		         * input : ali 
		         * output: girdiğiniz kelime 3 harfli ve unique karaktere sahip
		         * 
		         * input : ece
		         * output: girdiğiniz kelime 3 harfli ve unique karaktere sahip değil
		         */
		        Scanner scanner=new Scanner(System.in);
		        System.out.print("adınızı giriniz : ");
		        String name=scanner.nextLine();//eda
		        
		        char c1=name.charAt(0);//e
		        char c2=name.charAt(1);//d
		        char c3=name.charAt(2);//a
		        
		       String result=name.length() == 3 ?((c1!=c2 && c1!=c3 && c2!=c3)? "girdiginiz isim unique karakterlerden olusuyor ":"girdiginiz isim unique karakterlerden olusmuyor " ):"3 karakterden farklı isim girdiniz";
		        
		       System.out.println(result);
		       
		      
		      
		    }

}
