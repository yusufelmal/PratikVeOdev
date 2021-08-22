package day20Tekrar;

import java.util.Arrays;

public class C04_Tekrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "Java, candir";
		
System.out.println(Arrays.toString(str.split(",")));

String yukariAtama[]=str.split(",");

System.out.println(yukariAtama[1]);

String bolunmus2[]=str.split("a");

System.out.println(Arrays.toString(bolunmus2));

System.out.println(bolunmus2.length);

String atama[]=str.split("");

System.out.println(Arrays.toString(atama));

System.out.println(atama.length);

String cumle= "Java ogren, rahat yasa";

String kelimeArray[]=cumle.split(" ");

System.out.println(kelimeArray.length);


String cumle2=cumle.replaceAll("\\W", "");
System.out.println(cumle2); //Javaogrenrahatyasa
System.out.println(cumle2.length());

String harfArrayi[]=cumle2.split("");
System.out.println(harfArrayi.length);



	}

}
