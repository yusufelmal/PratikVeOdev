package mentoring14Agustos;

import java.util.Arrays;

public class C01_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    /*
	     * - Bir array olusturun, icerisinde 5 tane int eleman olsun
	     * - Arrayin elemanlarini guncelleyin
	     * - Array’in elamanlarini yazdirin
	     * - Bir for loop olusturun, loop ile arrayin tum elemanlarini 2
	     * artirin ve yazdirin
	     * - Loop’dan sonra Arrayi yeniden yazdirin
	     *
	     * - Yeni bir loop olusturun, array’in tum elemanlarini loop ile degistirip
	     * sonra tum arrayi yazdirin
	     * - Loop’dan sonra Arrayi yeniden yazdirin
	     *
	     * -elemanlari kalici olarak loop ile degistirin
	     */
		
		int necati[]=new int[5]; //necati yerine genelde arr yazılıyor
		
		System.out.println(Arrays.toString(necati));
		
		necati[0]=5;
		necati[1]=1;
		necati[2]=5;
		necati[3]=6;
		necati[4]=8;
		
		System.out.println(Arrays.toString(necati));
		
        // Bir for loop olusturun, loop ile arrayin tum elemanlarini 2 artirin ve yazdirin

		
		for(int each:necati) {
			System.out.println(each+2+"");}
		
		
		for(int i=0; i<necati.length; i++) {
			System.out.println(necati[i]+2);
		}
		

		// Loop’dan sonra Arrayi yeniden yazdirin
		System.out.println(Arrays.toString(necati));
		

	// Yeni bir loop olusturun, array’in tum elemanlarini loop ile degistirip sonra
	// tum arrayi yazdirin
	for(
	int i = 0;i<necati.length;i++)
	{
		necati[i] += 2;
	}System.out.println(Arrays.toString(necati));


}
	
	
}