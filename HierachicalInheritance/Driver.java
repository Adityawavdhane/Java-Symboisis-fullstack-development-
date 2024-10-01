package HierachicalInheritance;

public class Driver  {
	public static void main(String[] args) {
	
	Person p1 = new Person("Mayur","Nashik");
	System.out.println("Person Details:");
	System.out.println(p1);
	
	//dynamic allocation of memory parent to the child
	
		Person p;
		
		p= new Person("Mayur","nashik");
		
		if(p instanceof Person){
			System.out.println("Person Details "+p);
		}
		
		p = new EmployeeClass(1, "Comp sci");
		
		if(p instanceof EmployeeClass) {
			System.out.println("Employee Details: "+p);
		}
		
		p =  new StudentClass(77,"Class A");
		
		if(p instanceof StudentClass) {
			System.out.println("Student Details: "+p);
		}
	
	}	
}
