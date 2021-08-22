package day14Tekrar;

public class C05_Tekrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="java candir";
				
		System.out.println(str.substring(5));
		System.out.println(str.substring(5,7));
		
		String isim="yusuf";
		String soyisim="elmal";
		int sayi1=4;
		int sayi2=5;
		double sayi3=3.5;
		double sayi4=5.6;
		
		toplama(isim,soyisim);
		toplama(sayi1,sayi2);
		toplama(sayi3,sayi4);
		
		toplama(25.4,2);
		toplama(32,23.4);
		
		
	}

	private static void toplama(double sayi3, double sayi4) {
System.out.println(sayi3+sayi4);		
System.out.println("1. method");
	}

	private static void toplama(int sayi1, int sayi2) {
System.out.println(sayi1+sayi2);	
System.out.println("2. method");
	}

	private static void toplama(String isim, String soyisim) {
		// TODO Auto-generated method stub
		System.out.println(isim+soyisim);
		System.out.println("3. method");
	}

}
