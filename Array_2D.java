/* 2D Array Operstions */

package io;
import java.util.*;

public class Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,m;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter How Many row");
		n = sc.nextInt();
		System.out.println("Enter How Many column");
		m = sc.nextInt();
		
		int [][] arr1 = new int[n][m];
		int [][] arr2 = new int[n][m];
		int [][] sum = new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.println("Enter First  Array Elements");
				arr1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("First Array Elements are accepted");
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.println("Enter Second Array Elements");
				arr2[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Second Array Elements are accepted");
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println("");
		}
		
		System.out.println("Second array is");
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println("");
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				sum[i][j] = arr1[i][j] + arr2[i][j];				
			}
		}
		
		System.out.println("Sum of Array is");
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println("");
		}

	}

}
