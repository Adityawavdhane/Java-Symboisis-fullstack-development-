package io;
import java.util.*;


 class PersonDetails{
	
	String name, address;
	int age;
	
	 public PersonDetails() {
		// TODO Auto-generated method stub
		 System.out.println("Default Constructor.Person");
	}
	 
	public PersonDetails(String name,String address,int age)
	{
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	public void show()
	{
		System.out.println("Person Name "+name);
		System.out.println("Person Address "+address);
		System.out.println("Person age "+age);
	}
}

class StudentClass extends PersonDetails{
	int math,bio,chemistry,phy,eng;
	float avgmarks=0;
	
	StudentClass(){
		System.out.println("Default Constructor.Student");
	}
	
	StudentClass(String name,String address,int age, int math,int bio,int chemistry,int phy,int eng)
	{
		super(name,address,age);
		this.math=math;
		this.bio=bio;
		this.chemistry = chemistry;
		this.phy= phy;
		this.eng = eng;
		this.avgmarks = (math+bio+chemistry+phy+eng)/5;
	}
	
	public void show()
	{
		System.out.println("Student marks in Math subject: "+math);
		System.out.println("Student marks in Biology subject: "+bio);
		System.out.println("Student marks in Chemistry subject: "+chemistry);
		System.out.println("Student marks in Physics subject: "+phy);
		System.out.println("Student marks in Englist subject: "+eng);
		System.out.println("Student marks in math subject: "+avgmarks);
		if(avgmarks >=75 ) {
			System.out.println("Person Grade is A+");
		}
		if(avgmarks >= 65) {
			System.out.println("Person Grade is B+");
		}
		if(avgmarks >= 45) {
			System.out.println("Person Garde is C");
		}
		else
			System.out.println("Student is Fail");
	}
}

public class GradeMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter How Many person details");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Person Name");
			String name = sc.next();
			System.out.println("Enter Person Address ");
			String address = sc.next();
			System.out.println("Enter Person Age ");
			int age = sc.nextInt();
			System.out.println("Enter marks in Math ");
			int math = sc.nextInt();
			System.out.println("Enter marks in Biology");
			int bio = sc.nextInt();
			System.out.println("Enter marks in Chemistry");
			int chemistry = sc.nextInt();
			System.out.println("Enter marks in Physics");
			int phy = sc.nextInt();
			System.out.println("Enter marks in English");
			int eng = sc.nextInt();
			
			StudentClass st1 = new StudentClass();
			StudentClass st2 = new StudentClass(name,address,age,math,bio,chemistry,phy,eng);
		}

	}

}
