package aditya;
import java.util.*;
import java.util.Scanner.*;
public class person {

	int pAge;
	String pname;
	String paddress;
	public person(int pAge,String pname,String paddress) {
		this.pAge=pAge;
		this.pname=pname;
		this.paddress=paddress;
		}
	public void show() {
		 System.out.println("pAge "+pAge);
		 System.out.println("pname "+pname);
		 System.out.println("paddress"+paddress);
	
		 
	 }
		public static void main(String[] args) {
			int pAge;
			String pname;
			String paddress;
			Scanner sc=new Scanner(System.in);
			person[] plist=new person[3];
			for(int i=0;i<plist.length;i++) {
			System.out.print("Enter the Age of person: ");
			pAge=sc.nextInt();
			System.out.print("Enter the Name of person: ");
			pname=sc.next();
			System.out.print("Enter the Address of person: ");
			paddress=sc.next();
		
		}
					 
	for (int i=0;i<plist.length;i++);
			System.out.println();
		}
			}	
		


