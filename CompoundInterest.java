import java.util.*;
import java.lang.Exception.*;
import java.io.*;
import java.math.*;

class CompoundInterest{
	
	int principal_amt;
	float rate,time;
	int cmd_interest,amount;
	
	CompoundInterest(int principal_amt ,float  time, float rate)throws Exception
	{
		this.principal_amt= principal_amt;
		this.time=time;
		this.rate = rate;
	}
	
	public void display(int principal_amt ,float  time, float rate,double compoundInterest)throws Exception
	{
		System.out.println("Enter your principal amount: "+principal_amt);
		System.out.println("Enter giving for  year or time: "+time);
		
		
		System.out.println("Enter Interest Rate for amount "+rate);
		System.out.println("Compound Interest is: "+compoundInterest);		
	}
	

     public static void main(String[] args)throws IOException,Exception 
     {
    	 int principal_amt;
    	 float rate,time;
    	 int amount;
	
    	 Scanner sc = new Scanner(System.in);
	
    	 System.out.println("Enter your principal amount: ");
    	 principal_amt = sc.nextInt();
    	 System.out.println("Enter giving for how much year or time:  ");
    	 time = sc.nextFloat();
    	 System.out.println("Enter Interest Rate for amount ");
    	 rate = sc.nextFloat();
    	 double compoundInterest = principal_amt * Math.pow((1 + rate / 100), time);
	
    	 CompoundInterest obj = new CompoundInterest(principal_amt,time,rate);
    	 obj.display(principal_amt,time,rate,compoundInterest);
     }

}