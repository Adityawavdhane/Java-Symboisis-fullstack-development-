package aditya;
 
public class Onlineshopping {
     static int id=10;
	static String name;
    static String password;
public Onlineshopping(int id,String name,String password){
	this.id=id;
	Onlineshopping.name=name;
	Onlineshopping.password=password;
}
     
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name: ");
	name=sc.next();
	System.out.println("Enter the password: ");
	password=sc.next();
	if(name.equals(password)) {
		System.out.println("your name is "+name);
		System.out.println("your password is "+password);
		System.out.println("your id is"+id);
		id++;
}
	System.out.println("Do you want to add more:");

	
}
}


