/* Program for Arithmatic Calculations */

package io;
import java.util.*;

public class Arithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2,result=0;
		int ch;
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			
			System.out.println("Enter Your Choice:");
			ch = sc.nextInt();
			
			switch(ch)
			{
				case 1: System.out.println("Enter number");
				        num1=sc.nextInt();
				        System.out.println("Enter number");
				        num2 = sc.nextInt();
				        result = num1 + num2;
				        System.out.println("Addition of Two Number is "+result);
				        break;
				        
				case 2: System.out.println("Enter number");
		        		num1=sc.nextInt();
		        		System.out.println("Enter number");
		        		num2 = sc.nextInt();
		        		result = num1 - num2;
		        		System.out.println("Substraction of Two Number is "+result);
		        		break;
		        		
				case 3: System.out.println("Enter number");
		        		num1=sc.nextInt();
		        		System.out.println("Enter number");
		        		num2 = sc.nextInt();
		        		result = num1 * num2;
		        		System.out.println("Multiplication of Two Number is "+result);
		        		break;
		        		
				case 4: System.out.println("Enter number");
		        		num1=sc.nextInt();
		        		System.out.println("Enter number");
		        		num2 = sc.nextInt();
		        		result = num1 / num2;
		        		System.out.println("Division of Two Number is "+result);
		        		break;
		       
				case 5: System.exit(0);
			}
		}

	}

}
