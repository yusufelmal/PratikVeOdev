package mentoring14Agustos;

import java.util.Arrays;

public class C02_multidimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /*
	     * 2 boyutlu bir array'de en buyuk sayiyi bulan bir method yazin
	     *
	     * Input : {{1,2,3},{4,5},{6,7,8}}
	     * Output : 8
	     *
	     *
	     */
		
	
		        int arr[][] = {{1,13,2},{15,26},{2,0,15,21}};
		        System.out.println(Arrays.deepToString(arr));
		        System.out.println(findMaxInArray(arr));
		    }
		    public static int findMaxInArray(int array[][]){
		        int max = Integer.MIN_VALUE;
		        for(int i = 0; i < array.length; i++){
		            for(int j = 0; j < array[i].length; j++){
		                if(array[i][j] > max){
		                    max = array[i][j];
		                }
		            }
		        }
		        /*
		        for(int[] w: array){
		            for(int each:w){
		            if(each>max){
		                max=each;
		            } 
		        }
		    }
		         */
		        
		        return max;
		    }
		}
			
			
			
		
		
		


