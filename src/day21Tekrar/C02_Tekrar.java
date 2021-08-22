package day21Tekrar;

public class C02_Tekrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    // Soru 1 ) Asagidaki multi dimensional array’in tum elemanlarinin 
        // carpimini ekrana yazdiran bir method yaziniz. 
        // { {1,2,3}, {4,5,6} }
		
		int arr [][]= {{1,2,3},{4,5,6}}; //burayı ne kadar uzatırsan uzat calisir
		
		int carpim=1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				carpim*=arr[i][j];
				
			}
			
		}
		System.out.println("tum elementlerin carpimi : " +carpim);

	}

}
