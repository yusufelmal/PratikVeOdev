package practise_21_08_2021;

public class InheritanceRunner extends Inheritance_01{
	
	public static void main(String[] args) {
		
		System.out.println(isim);//methodsuz obje üretmeden çağırabildim.
		
		concat();
		
	//	concat("cuzdan"+50);//static olmadığı için kullanılmıyor
		
		
	}
	
	//nonstatic field hem static hem nonstatic kabul ediyor.
	//aşağıda nonstatic var. statiğe de non statice de ulaştı.
	//ama yukarıda static var. sadece statik metodu okuyor.
	
	public void a() {
		concat("cuzdan", 50);
		concat();
		
		
		
	}

}
