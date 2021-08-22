package practise_21_08_2021;

public class C01_Encapsulation {
	
	private int fiyat;
	public String isim;
	
	//Getter
	
	public int getFiyat() {
		return fiyat;
	}
	
	//Setter
	
	public  void setFiyat(int fiyat) {
		
		this.fiyat=fiyat; //burda lokalde de fiyat olsaydı this. diyerek instance-en üsteteki private yazan yere atfen this 
		//demiş olacaktık. fakat şuan this demesek de olur zaten aynı yere gidiyor başka alternatif yok.
		
	}
	
	C01_Encapsulation(){
		
		
	}
	//constructorlar aynı parametreli constructor gibiler
	C01_Encapsulation(int fiyat, String isim){
		this.fiyat=fiyat;
		this.isim=isim;
		
	}

}
