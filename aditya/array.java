package aditya;
import java.util.*;
import java.util.Scanner.*;
public class array {
   public static void main(String[]args) {
	   Scanner sc=new Scanner(System.in);
	 /*  int[]array=new int[]{1,2,3,4,5};
	   array=new int[10];
	   array[0]=1;
	   array[1]=2;
	   array[2]=3;
	   array[3]=4;
	   array[4]=5;*/
	   System.out.print("Enter the numbers of elements in the array: ");
	   int n = sc.nextInt();
	   int[] array = new int[10];
	   System.out.print("Enter the elements in the array: ");
	   {
		    for(int i=0;i<10;i++)
		    	array[i] = sc.nextInt();
	   }
	   System.out.println("The elements in the array are:");
	   {
		   for(int i=0;i<10;i++)
			   System.out.print(array[i]);
	   }
	  }
   }

