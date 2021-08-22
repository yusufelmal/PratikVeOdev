package day15Tekrar;

public class C01_Tekrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int level = 20;
		int puan = 1000;

		bonusHesapla(level, puan);

		puan+=bonusHesapla(level, puan);
		
		System.out.println(puan);
	}

	private static int bonusHesapla(int level, int puan) {
		// TODO Auto-generated method stub
	int bonus=0;
		if (level<=10) {
			if(puan<1000) {
				bonus=50;
			}else {
				bonus=100;
			}
		
		} else if(level<=50) {
			bonus=puan*10/100;
			
			
		}else{ 
			if (puan<10000) {
				bonus=1000;
			} else {
				bonus=puan*15/1000;
			}
		}
		return bonus;
	}

}
