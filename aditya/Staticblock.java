package aditya;

public class Staticblock {
	 
	
	static {
		     System.out.println("-----With in Static Block-----");
		     srNo=1000;
	}
	//static method
	static void display() {
		//System.out.println("Section:"+section);//cant access non static instant variable//
		System.out.println("Serial No."+srNo);
	
	}
	//default constructor
	Staticblock(){
		System.out.println("----With Default Constructor----");
		srNo++;
		section++;
	}
//Override
  public String toString() {
	  return "Myclass[Serial NO"+srNo+",Section= "+section+"]";
  }
public static void main(String[]args) {
	Staticblock o1= new Staticblock();
			System.out.println(o1);
			Staticblock.display();
			Staticblock o2= new Staticblock();
			System.out.println(o2);
			Staticblock.display();
			Staticblock o3=new Staticblock();
			System.out.println(o3);
			Staticblock.display();
			
  }
}
