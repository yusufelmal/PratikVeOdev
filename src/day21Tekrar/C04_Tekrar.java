package day21Tekrar;

import java.util.Arrays;

public class C04_Tekrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int arr [][]= { {1,2,3}, {4,5}, {6,7} };
		
		int toplamlarArrayi[]=new int[arr.length];
		

		
		for (int i = 0; i < arr.length; i++) {
			int elementlerToplami=0;
			for (int j = 0; j < arr[i].length; j++) {
				elementlerToplami+=arr[i][j];
			}
			toplamlarArrayi[i]=elementlerToplami;
			
		}
		System.out.println(Arrays.toString(toplamlarArrayi));

	}

}
