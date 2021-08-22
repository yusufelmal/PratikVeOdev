package day20Tekrar;

import java.util.Arrays;

public class C03_Tekrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 3, 15, 10, 11, 9, 1, 25 };

		arr = arrayiSirala(arr);
		System.out.println(Arrays.toString(arrayiSirala(arr)));

		
	    arrayiTers(arr);
		
		System.out.println(Arrays.toString(arrayiTers(arr)));
 
	}

	private static int[] arrayiTers(int[] arr) {
		// TODO Auto-generated method stub
		int temp[] = new int[arr.length];

		for (int i = 0; i < temp.length; i++) {
			temp[i] = arr[arr.length - 1 - i];
			

		}return temp;

	}

	private static int[] arrayiSirala(int[] arr) {
		// TODO Auto-generated method stub

		Arrays.sort(arr);
		// System.out.println(Arrays.toString(arr));
		return arr;

	}

}
