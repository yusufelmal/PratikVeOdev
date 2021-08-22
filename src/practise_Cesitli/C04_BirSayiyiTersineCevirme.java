package practise_Cesitli;

import java.util.Arrays;

public class C04_BirSayiyiTersineCevirme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * giriş 12345
		 * çıkış 54321
		 */
	int arr[]= {1,2,3,4,5};
	System.out.println(Arrays.toString(arr));
	
	int temp = arr[0];
	
	for (int i = 0; i < arr.length-1; i++) {
		arr[i]=arr[i+1];
		
	}System.out.print(Arrays.toString(arr));
	}

}
