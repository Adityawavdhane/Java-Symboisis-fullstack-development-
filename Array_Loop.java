/* Program for Array Loop */
package io;

import java.util.*;

public class Array_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n,sum=0;
		System.out.println("Enter How Many array Element:");
		n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter array Element");
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}

		for (int i = 0; i < n; i++) {
			System.out.println("Array Elements are: " + arr[i]);	

		}
		for (int i : arr)
			System.out.println(" " + i);
		
		System.out.println("Sum of Array is: "+sum);

		System.out.println("Array in Reverse order");
		for(int i=n;i>0;i--)
		{
			System.out.print("  "+i);
			
		}
		
	}
		
}
