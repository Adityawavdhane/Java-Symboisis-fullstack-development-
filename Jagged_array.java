/* Program of jagged array */

package io;

public class Jagged_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int sum=0;
		int [][] arr1 = new int[3][5];
			
		for(i=0;i<3;i++)
		{
			for(j=0;j<5;j++)
			{
				arr1[i][j] = (i+1) * (j+1) ;      
			}
		} 
		
		for(i=0;i<arr1.length;i++)
		{
			for(j=0;j<arr1.length;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------");
		
		for(int x[]: arr1)
		  for(int y : x) {
			  System.out.print(y+" ");
			  sum +=y;
		  }
		System.out.println();
		System.out.println("Sum of Array "+sum);
		
	}

}
