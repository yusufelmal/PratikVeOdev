package proje;

public class C01_MarketProjesi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		public static List<String> urunler = new ArrayList<>();
		public static List<Double> urunFiyatlari = new ArrayList<>(); // 1.a ve 1.b

		public static List<String> sepetUrunler = new ArrayList<>(); // 3.a
		public static List<Double> sepetkg = new ArrayList<>(); // 3.a
		public static List<Double> sepetFiyat = new ArrayList<>(); // 3.a

		public static void main(String[] args) {
			/* Basrili Market alış-veriş programı.
	        *
	        * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
	        *          No     Ürün         Fiyat
	                  ====  =======        =========
	                   00   Domates         2.10 TL
	                   01   Patates         3.20 TL
	                   02   Biber           1.50 TL
	                   03   Soğan          2.30 TL
	                   04   Havuç              3.10 TL
	                   05   Elma            1.20 TL
	                   06   Muz             1.90 TL
	                   07   Çilek              6.10 TL
	                   08   Kavun           4.30 TL
	                   09   Üzüm              2.70 TL
	                   10   Limon           0.50 TL
	        * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
	        * 3. Adım: Kaç kg satın almak istediğini sorunuz.
	        * 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız.
	        * 5. Başka bir ürün alıp almak istemediğini sorunuz.
	        * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz.
	        * 7. Eğer bitirmek istiyorsa ödeme kısmına geçiniz ve ödem sonrasında programı bitirinzi.
	        */

			
			urunler.addAll(Arrays.asList("Domates", "Patates", "Biber", "Sogan", "Havuc", "Elma", "Muz", "Cilek", "Kavun",
					"Uzum", "Limon"));

			urunFiyatlari.addAll(Arrays.asList(2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50));

			double toplamFiyat = 0.0; // 3.c
			String secim;
			double toplam = 0.0;

			urunListele(); // 2.b

			do {
				Scanner scan = new Scanner(System.in); // 2.a
				System.out.println("Urun kodunu giriniz : "); // 2.c
				int urunNo = scan.nextInt(); // 2.d
				System.out.println("Urun miktarini giriniz(kg cinsinden) : "); // 2.c
				double urunMiktari = scan.nextDouble(); // 2.e

				sepeteEkle(urunNo, urunMiktari);

				System.out.println("Alisverise devam etmek ister misiniz? evet ise e hayir ise h giriniz :");

				secim = scan.next();

			} while (secim.equalsIgnoreCase("e"));
			for (double each : sepetFiyat) {
				toplam += each;
			}
			System.out.println(toplam);

			odeme(toplam);
		}

		public static void urunListele() { // 1.c ve 1.d

			System.out.println("No\tUrun\tFiyat");
			System.out.println("===\t=======\t=======");

			for (int i = 0; i < urunler.size(); i++) { // 1.e
				System.out.println(i + "\t" + urunler.get(i) + "\t" + urunFiyatlari.get(i));
			}
		}

		public static void sepeteEkle(int urunNo, double urunMiktari) { // 3.b
			sepetUrunler.add(urunler.get(urunNo)); // 3.b
			sepetkg.add(urunMiktari); // 3.b
			sepetFiyat.add(urunFiyatlari.get(urunNo) * urunMiktari); // 3.b

		}

		public static void odeme(double toplam) {

			Scanner scan = new Scanner(System.in);
			System.out.println("Odenecek toplam fiyat : " + toplam);

			System.out.println("Odenecek tutari giriniz : ");
			double odenecekTutar = scan.nextDouble();
			System.out.println("Para ustunuz : " + (odenecekTutar - toplam));

		}

	}


	}

}
