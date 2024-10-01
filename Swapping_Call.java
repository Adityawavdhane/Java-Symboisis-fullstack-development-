package io;
import java.util.*;

public class Swapping_Call {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2,temp;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		num1 = sc.nextInt();
		System.out.println("Enter Second number");
		num2 = sc.nextInt();
		
		System.out.println("before swapping "+num1+" "+num2);
		
		temp=num1;
		num1=num2;
		num2=temp;

		System.out.println("after Swapping "+num1+" "+num2);
		
	}

}
