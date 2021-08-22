package day21Tekrar;

import java.util.Arrays;

public class C01_Tekrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr [][]= {{1},{2,3,4},{5,6,7,8}};
		
		//bu arrayi nested for loop
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j]+" ");
			}
		System.out.println("");
		}
		
		System.out.println(Arrays.deepToString(arr));
		
	}

}
