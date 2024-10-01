package io;
import java.util.*;

public class Swapping_ref {
	
	int value;
	
	Swapping_ref(int value){
		this.value = value;
	}
	
	public static void Swap(Swapping_ref n1,Swapping_ref n2)
	{
		int temp = n1.value;
		n1.value = n2.value;
		n2.value = temp;
		
		System.out.println(n1.value+" \t "+n2.value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		num1 = sc.nextInt();
		System.out.println("Enter First Number");
		num2 = sc.nextInt();
		
		System.out.println(num1+ " \t "+num2);
		
		Swapping_ref n1 = new Swapping_ref(num1);
		Swapping_ref n2 = new Swapping_ref(num2);
		
		Swap(n1,n2);
	}

}
