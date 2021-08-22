package replit_ifSwitchTernary;

import java.util.Scanner;

public class C05_OgrenciYaniti {

	public static void main(String[] args) {
		
		/*Char değişken yanıtının değerini test eden ve aşağıdaki işlemleri gerçekleştiren bir switch ifadesi yazın:
		yanıt a ise,
		"Talebiniz işleniyor" mesajı yazdırılır
		yanıt b ise,
		"yine de ilgilendiğiniz için teşekkür ederiz" mesajı yazdırılır yanıt c ise,
		"Üzgünüz, şu anda herhangi bir yardım yok" mesajı yazdırılır
		başka herhangi bir yanıt değeri için,
		"Geçersiz giriş, lütfen tekrar deneyin!" yazdırılır
		*/
		        
		        Scanner scan=new Scanner(System.in);
		        System.out.println("Lutfen bir komut giriniz");
		        char komut=scan.next().charAt(0);
		        
		        switch(komut) {
		        
		        case 'a' :
		            System.out.println("talebiniz isleniyor");
		            break;
		            
		        case 'b':
		            System.out.println("yinede ilgilendiginiz tesekkur ederiz");
		            break;
		        case 'c' :
		            System.out.println("Üzgünüz, şu anda herhangi bir yardım yok");
		            break;
		         default:
		             System.out.println("gecersiz giris tekrar deneyin");
		             
		            
		        }
	}
}
