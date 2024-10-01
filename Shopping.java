/* Program to accept shooping customer details */

package io;
import java.util.*;

public class Shopping {
	
	private  String username,password;
	private static int cust_id;
		
	static {
		System.out.println("-----Welcome To our Shopping Website-----------");
		cust_id=100;
	}
	
	static void display() {
		        cust_id++;
            	System.out.println("Your Customer ID is: "+cust_id);
		}
	
	public  void user_display()
	{
		if(username.equals(password)) {
			System.out.println("Your Username  is: "+username);
			System.out.println("Your Password  is: "+password);
		}
	}
    
	public Shopping(String username,String password){
		
		this.username= username;
		this.password = password;
	}
	
	public static void main(String[] args)
	{
		char y;
		String username, password;
		int n,i=0;
		
		Scanner sc = new Scanner(System.in);
		
		Shopping[] usernameRecord = new Shopping[999];
		
		System.out.println("Do you want to add customers if(yes:y/no:n)");
		y = sc.next().charAt(0);
		
		while(true)
		{	
			if(y=='y')
			{
				System.out.println("Enter Username");
				username = sc.next();
				System.out.println("Enter Password");
				password = sc.next();
				
				if(username.equals(password)) {
					usernameRecord[i] = new Shopping(username,password);
					i=i+1; 
				}
					
				Shopping sh = new Shopping(username,password);
				System.out.println("------------------------------------");
				System.out.println("Your Account is Created Successfully!!");
				System.out.println("Your Details is");
				sh.user_display();
				Shopping.display();		
			}
			
			System.out.println("If you want to create more accounts then press(1) other wise press(0) to exit");
			n= sc.nextInt();
	
			if(n!=1) {
				System.out.println("Thank You.....");
				System.exit(0);
			}
				
		}	
		
		
	}
	
}
