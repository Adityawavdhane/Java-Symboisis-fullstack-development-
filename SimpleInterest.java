/* Program for calculating simple interest */ 
package io;
import java.util.*;

public class SimpleInterest {

	int profit;
	float rate, year;
	 float interest;
	
	SimpleInterest(int profit, float rate, float year)
	{
	  	this.profit = profit;
	  	this.rate = rate;
	  	this.year = year;
	}
    
	public void display(int profit, float rate, float year, float interest)
	{
		System.out.println("The Profit value is: "+profit);
		System.out.println("The Rate is: "+rate);
		System.out.println("The year is: "+year);
		System.out.println("The Calculated Interest is: "+interest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		int profit;
		float rate,year;
		float interest;
		
		System.out.println("Enter your Profit: ");
		profit = sc.nextInt();
		System.out.println("Enter your Interest Rate: ");
		rate = sc.nextFloat();
		System.out.println("Enter How much time or year are you giving: ");
		year = sc.nextFloat();
		
		interest = profit * rate * year / 100;
		SimpleInterest obj = new SimpleInterest(profit,rate,year);
		obj.display(profit, rate, year, interest);
	}

}
