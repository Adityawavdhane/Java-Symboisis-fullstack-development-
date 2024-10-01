/* Program for accept Person Details */

package io;
import java.util.*;

public class Person {
	
	int id;
	String name;
	
	public Person(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public void show()
	{
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
	}
	
	public String toString() {
		return name;
	}
	
	public static void main(String[] args)
	{
		int n,i;
		int id;
		String name;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter How many persons");
		n = sc.nextInt();
		
		Person [] team = new Person[n];
		
		for(i=0;i<n;i++)
		{
			System.out.println("Enter Id");
			id = sc.nextInt();
			System.out.println("Enter Name");
			name=sc.next();
			
			team[i] = new Person(id,name); 
		}
		
		for(i=0;i<n;i++)
		{
			team[i].show();
		}
		System.out.println("-------------------------");
		for(Person p: team)
			System.out.println(p);
	}

} 
