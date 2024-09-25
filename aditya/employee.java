package aditya;

public class employee {
	int empID;
	String empname,address;
	public employee(int empID,String empname,String address) {
		this.empID=empID;
		this.empname=empname;
		this.address=address;
	}
	void show() {
		System.out.println("employee ID is"+empID);
		System.out.println("employee Name is"+empname);
		System.out.println("employee address is"+address);
	}
	public static void main(String[] args) {
		employee[] emplist=new employee[2];
		emplist[0]=new employee(1,"Aditya","Nashik");
		emplist[1]=new employee(2,"Sanket","Satana");
		emplist[0].show();
		emplist[1].show();
		
	}
	

}
