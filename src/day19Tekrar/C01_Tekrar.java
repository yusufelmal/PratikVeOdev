package day19Tekrar;

import java.util.Arrays;

public class C01_Tekrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr1 []= new String[4];
		
	
		
		arr1[0]="Ali";
		arr1[1]="Veli";
		arr1[2]="Ayse";
		arr1[3]="Fatma";
		
		System.out.println(arr1[2]);

		String isimler[]= {"Ali", "Veli", "Ayse", "Fatma"};
		System.out.println(isimler[1]);
		
		isimler[1]="hasan";
		System.out.println(isimler[1]);
		System.out.println(isimler.length);
		
		for (int i = 0; i < isimler.length; i++) {
			System.out.print(isimler[i]+" ");
			
		}
		System.out.println("");
		System.out.println(Arrays.toString(isimler));
	}

}
