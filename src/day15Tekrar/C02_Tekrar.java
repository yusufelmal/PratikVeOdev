package day15Tekrar;

public class C02_Tekrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 10; i < 20; i++) {
			System.out.print(i + " ");
			
		}
		System.out.println();
			
		for (int i = 100; i < 200; i+=10) {
			
			System.out.print(i+" ");
	
		} System.out.println();
		
		for (int i = 50; i >= 20; i-=3) {
			System.out.print(i +" ");
		} System.out.println();
		
		for (int i = 50; i <100; i+=3) {
			System.out.print(i+" "); //bu 3e bölünen sayıları vermiyor. 
		} System.out.println();
		
		for (int i = 50; i <100; i++) {
			
			if(i%3==0) {
				System.out.print(i+" ");//ama bu veriyor
				
			}
		}
			

	}

}
