package aditya;

import java.util.*;
public class shopping {
	private String name,password;
	private static int cust_id;
    Scanner sc= new Scanner(System.in);
	static {
	     System.out.println("-----welcome to the shopping -----");
	     cust_id=10;
}
//static method
static void display() {
	System.out.println("your  customer id is"+cust_id);
}
public void user_display() {
	if(username.equals(password)) {
		System.out.println("Your username is:"+username);
		System.out.println("Your password is:"+password);
	}
}

