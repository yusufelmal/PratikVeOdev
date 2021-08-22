package replit_forWhileDonguleri;

public class C05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 100'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.
		 * 
		 * OUTPUT : 100 98 96 94 92 … … … … 2 0
		 */

		
		for (int i = 0; i <= 100; i+=2) {
			
			System.out.print(100-i+" ");
			
			
		
		}
		System.out.println();
		
		for (int i = 0; i <= 100; i++) {
			
			if(i%2==0) {
				System.out.print(100-i+" ");
			}
		}
	}
	

}
