/* Program to find is character , digit or special Symbol */

package io;
import java.util.*;

public class Find_digit {
	
	public static void main(String args[])
	{
		char ch;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any Character");
		ch = sc.nextLine().charAt(0);
		
		if(ch=='!' || ch=='@' || ch=='#' || ch=='$' || ch=='%' || ch=='&')
		{
			System.out.println("It's Special Symbol");
		}
		else
			if(ch=='0' || ch=='1' || ch=='2' || ch=='3' || ch=='4' || ch=='5' || ch=='6' || ch=='7' || ch=='8' || ch=='9')
			{
				System.out.println("It's Digit");
			}
			else
				System.out.println("It's Character");
	}

}
