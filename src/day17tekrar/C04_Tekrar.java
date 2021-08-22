package day17tekrar;



public class C04_Tekrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Soru 2 ) For loop ve while Loop kullanarak 
		//3 basamakli sayilardan 15, 20 ve 90’na tam bolunebilen sayilari yazdirin.
		
		int i = 100;
		
		while (i>=100 && i<1000) {
			
		if(i%15==0 && i%20==0 && i%90==0) {
			System.out.print(i+ " ");
		}
			
			i++;
		}
		System.out.println("");
		for (int i1 = 100; i1<1000; i1++) {
			if (i1%15==0 && i1%20==0 && i1%90==0) {
				System.out.print(i1+" ");
				
			}
			
		}
	}

}
