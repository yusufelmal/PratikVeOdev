package day19Tekrar;

import java.util.Arrays;

public class C02_Tekrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[5];

		System.out.println(Arrays.toString(arr));

		// arr [5]=5; //arrayin uzunluğu sonradan değiştirilemez..

		arr = new int[6];

		System.out.println(Arrays.toString(arr));

		arr[2] = 1;
		System.out.println(Arrays.toString(arr));

		arr = new int[6];

		System.out.println(Arrays.toString(arr));  // arrayin lenght i değiştirilemez değiştirdim sanarsın ama sıfırdan başka bir array çakar

	}

}
