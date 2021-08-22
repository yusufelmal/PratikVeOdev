package mentoring23Temmuz;

import java.util.ArrayList;
import java.util.List;

public class C02_30TemmuzArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Bir arrayde sadece tek ve çift sayilarin kontrolü
		

			
			int [] arr = { 13,5,3,1,7,29,11};
			
			List <Integer> tekList = new ArrayList<>(); 
			List <Integer> ciftList = new ArrayList<>(); 
			
			int countTek=0;
			int countCift=0; 
			
			for(int each:arr) {
				
				if(each%2==0) { 
					ciftList.add(each);
					
				//	countCift++;
					
					
				}
				if(each%2==1) {
				//	countTek++;
					
					tekList.add(each);
					
					
				}

			}
			
	/*		if(arr.length==countCift) {
				System.out.println("arraydeki tüm elemanlar cift");
			} else if (arr.length==countTek) {
				System.out.println("arraydeki tüm elemanlar tek");
			
				
			}else {
				System.out.println("degil");	
					}
				*/
			
			
		System.out.println(tekList);
		System.out.println(ciftList);
		}
	
	}
