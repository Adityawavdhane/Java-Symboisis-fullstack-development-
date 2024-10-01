package io;
import java.util.*;


class Person{
	int age;
	String name,address;
	String phone_no;
	
	public Person() {
		System.out.println("Default constructor.Person");
	}
	
	public Person(String name, String address, int age,String phone_no)
	{
		this.name = name;
		this.address = address;
		this.age = age;
		this.phone_no = phone_no;
	}
	
	public void PersonDetails()
	{
		System.out.println("Person Name: "+name);
		System.out.println("Person Address: "+address);
		System.out.println("Person Age: "+age);
		System.out.println("Person Phone Number "+phone_no);
	}
	
	public void setPhoneNumber(String newphone_no) {
		this.phone_no = newphone_no;
	}
	
	public void setName(String newname) {
		this.name = newname;
	}
	
	public void setAddress(String newaddress) {
		this.address = newaddress;
	}
	
	public void setAge(int newage) {
		this.age = newage;
	}
}

class Student extends Person {
	
	int math,bio,phy,eng,che;
	private int[] marks = new int [5];
	
	public Student()
	{
		System.out.println("Default Constructor.Student");
	}
	
	public Student(String name,String address,int age,String phone_no)
	{
		super(name,address,age,phone_no);
	}
	

	public void setMark(int subject, int mark)
	{
		this.marks[subject] = mark;
	}
	
	public int calculateMarks() {
		int total=0;
		for(int mark : marks)
		{
			total += mark;
		}
		return total;
	}
	
	public double calculatePercentage() {
		int total = calculateMarks();
		return (total / 5);
	}
	
	public void displayPerson()
	{
		super.PersonDetails();
	}
	
	 public String StudentGrade(double percentage) {
	         if (percentage >= 90) 
	            return "A";
	         else if (percentage >=75 ) 
	            return "B";
	         else if (percentage >= 65) 
	            return "C";
	         else if (percentage >= 45) 
	            return "D";
	         else 
	            return "Fail";
	        }
	
	 public void displayStudentDetails() {
	        displayPerson();
	        int total = calculateMarks();
	        double percentage = calculatePercentage();
	        String grade = StudentGrade(percentage);

	        System.out.println("Total Marks: " + total);
	        System.out.println("Percentage: " + percentage + "%");
	        System.out.println("Grade: " + grade);
	    }
	 
	
}

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] student = new Student[999];
		
		int i,n;
		 
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter how many persons");
		 n = sc.nextInt();
		 
		 for(i=0;i<n;i++) {
	        System.out.print("Enter name: ");
	        String name = sc.next();
	        System.out.print("Enter address: ");
	        String address = sc.next();
	        System.out.print("Enter age: ");
	        int age = sc.nextInt();
	        System.out.println("Enter Your Phone Number");
	        String phone_no = sc.next();
	        student[i] = new Student(name, address, age,phone_no);
		 }      
	        System.out.println("You are given the Exam (yes/no)");
	        String yes = sc.next();
	        if((yes).equals("yes"))
	        {	
	        	System.out.println("Enter marks for five subjects:");
	        		for (i = 0; i < 5; i++) {
	        			System.out.print("Subject " + (i + 1) + ": ");
	        			int mark = sc.nextInt();
	        			student[i].setMark(i, mark);
	        			
	        		}
	        		
	        }
	        else
	        {
	        	for(i=0;i<n;i++) {
	             	System.out.println("Your Person Details is:");
	        	    student[i].displayPerson();
	        	}
	        
	        }
	          
	        System.out.println("Do you want to make changes in your details? (yes/no): ");
	        String editchoice = sc.next();
	        
	        System.out.println("Enter person number for changing details: ");
	        int pno = sc.nextInt();
	        
	         
	        if((editchoice).equals("yes")) {
	        	System.out.println("What you want to change Phone_Number/Name/Address/Age");
	        	String editField = sc.next();
	        	
	        	if((editField).equals("Phone_Number") || (editField).equals("Phone Number") || (editField).equals("phone_number") || (editField).equals("phone number")) {
	        		System.out.println("Enter Your New Phone Nuber");
	        		String NewPhone_no = sc.next();
	        		student[i].setPhoneNumber(NewPhone_no);
	        		System.out.println("Phone number changed successfully!");
	        		student[i].displayPerson();
	        	}
	        	else if((editField).equals("Name") || (editField).equals("name")) {
	        		System.out.println("Enter Your New Name");
	        		String newname = sc.next();
	        		student[i].setName(newname);
	        		System.out.println("New name changed Successfully!");
	        		student[i].displayPerson();
	        	}
	        	else if((editField).equals("Age") || (editField).equals("age")) {
	        		System.out.println("Enter Your New Age");
	        		int newage = sc.nextInt();
	        		student[i].setAge(newage);
	        		System.out.println("New age changed Successfully!");
	        		student[i].displayPerson();
	        	}
	        	else if((editField).equals("Address") || (editField).equals("address")) {
	        		System.out.println("Enter Your new Address");
	        		String newaddress = sc.next();
	        		student[i].setAddress(newaddress);
	        		System.out.println("New address changed Successfully!");
	        		student[i].displayPerson();
	        	}
	        	else {
	        		System.out.println("NO Changes is Made.........");
	        	}
	        		
	        }
	        else {
	        	System.out.println("Thank You for Registration.........................");
	        }
		        	
	}
	
}