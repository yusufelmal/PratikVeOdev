package practise_Cesitli;

import java.util.Arrays;

public class C06_TerstenYazdirma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String isim="Coding is great";
		
		String[] harf= isim.split("");
		
		System.out.println(Arrays.toString(harf));
		
		String temp []= new String [harf.length];
		
		System.out.println(Arrays.toString(temp));
		
		for (int i = 0; i <= temp.length-1; i++) {
			temp[i]=harf[harf.length-i-1];
			
			
		}
		System.out.println(Arrays.toString(temp));
		
	
			
		}
		
		
	
}
