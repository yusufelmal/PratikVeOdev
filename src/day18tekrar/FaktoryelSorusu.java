package day18tekrar;

import java.util.Scanner;

public class FaktoryelSorusu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
         System.out.println("Lutfen bir faktoryel bulmak icin bir sayi giriniz: ");
         int num = scan.nextInt();
         
         int faktoryel = 1;
         
             System.out.print(num+"!=");
             for (int i=1; i<=num; i++)
             {
                 faktoryel = faktoryel*i;
           
                 System.out.print(i);
         
                 if(i < num)
                     System.out.print("*");
                 
            }   System.out.print("=" + faktoryel);

	}

}
