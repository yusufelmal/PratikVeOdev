package day20Tekrar;

import java.util.Arrays;

public class C01_Tekrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3 };

		int gecici = arr[0];

		arr[0] = arr[1];
		arr[1] = arr[2];
		arr[2] = gecici;

		System.out.println(Arrays.toString(arr));

		// sayi sinirsiz olursa?

		int arr2[] = { 1, 2, 3, 4, 5, 6, 7 };
		gecici = arr2[0];

		for (int i = 0; i < arr2.length - 1; i++) {
			arr2[i] = arr2[i + 1];

		}
		System.out.println(Arrays.toString(arr2));
		arr2[arr2.length - 1] = gecici;

		System.out.println(Arrays.toString(arr2));
	}

}
