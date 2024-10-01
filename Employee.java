/* Program for accepting Employee Details */

package io;
import java.util.*;

public class Employee {
	
	int empCode;
	String empName, empAdd;
	
	public Employee(int empCode, String empName, String empAdd)
	{
		this.empCode = empCode;
		this.empName = empName;
		this.empAdd  = empAdd;
	}
	
	public void show()
	{
		
			System.out.println("Employee Code is "+empCode);
			System.out.println("Employee Code is "+empName);
			System.out.println("Employee Code is "+empAdd);
			
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How Many Employees");
		n = sc.nextInt();
		
		Employee emplist[] = new Employee[n];
		
		for(i=0;i<n;i++)
		{
			System.out.println("Enter Employee Code");
			int code = sc.nextInt();
			System.out.println("Enter Employee Name");
			String name = sc.next();
			System.out.println("Enter Employee Address");
			String add = sc.next();
			
			emplist[i] =new Employee(code,name,add);
		}
	   for(i=0;i<n;i++)
	   {
		   emplist[i].show();
	   }

	}

}
