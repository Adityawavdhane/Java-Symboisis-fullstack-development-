import java.util.*;
package io;

class EmployeeClass{
	int empId;
	String empName, empDept;
	public EmployeeClass(){
		System.out.println("Default Constructor.Employee");
	}
	
	public EmployeeClass(int empId,String empName,String empDept){
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		System.out.println("Default Constructor.Employee:");
	}
	
	public void show() {
		
		System.out.println("Employee Id is: "+empId);
		System.out.println("Employee Name is: "+empName);
		System.out.println("Employee Department is: "+empDept);
	}
}

class Manager extends EmployeeClass{
	
	String empDegin;
	int Salary;
	
	 Manager(){
		System.out.println("Default constructor.Manager");		
	}
	
	public Manager(int empId,String empName,String empDept, String Degin,int Salary) {
		super(empId,empName,empDept);
		this.empDegin = Degin;
		this.Salary = Salary;
	}
	
     public void show() {
		System.out.println("Employee Designation is: "+empDegin);
		System.out.println("Employee Salary is: "+Salary);
	   }
	
}

public class SingleInheritanceOfClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how employee");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Employee Id");
			int Id = sc.nextInt();
			System.out.println("Enter Name of Employee");
			String name = sc.next();
			System.out.println("Enter Department of Employee");
			String dept = sc.next();
			System.out.println("Enter Designation of Employee");
			String Degin = sc.next();
			System.out.println("Enter Employee Salary");
			int salary = sc.nextInt();
			
			Manager m1 = new Manager(Id,name,dept,Degin,salary);
			Manager m2 = new Manager();
		}

	}

}
