package Polymorphas;
import java.util.*;

public class EmployeeSalary {
	
	
	public static void calculateSalary() {
		System.out.println("no args ");
	}
	
	public static void calculateSalary(float basic) {
		System.out.println("Only basic in this method: "+basic);
	}
		
	public static void calculateSalary(float basic,float da) {
		System.out.println("This method only have basic and da: "+(basic+da));
	}
	
	public static void calculateSalary(float basic,float da,float ha) {
		System.out.println("This method have basic or da and ha : "+(basic+da+ha));
	}
	
	public static void calculateSalary(float basic,float da,float ha,float bonus) {
		System.out.println("This method have basic,da,ha,bonus: "+(basic+da+ha+bonus));
	}
	
	public static void calculateSalary(String AwardTitle,float bonus) {
		System.out.println("This method have Award Title: "+AwardTitle+" and Bonus: "+bonus);
	}
	
	public static void main(String[] args) {
	
		float bonus,basic,ha,da;
		String AwardTitle;
		int ch;
		
		Scanner sc = new Scanner(System.in);
	  	
		do{
			
			System.out.println("Enter Your Choice to Calculate Your Salary");
			System.out.println("1. Calculate on Basic");
			System.out.println("2. Calculate on Basic + DA");
			System.out.println("3. Calculate on Basic + DA + HA");
			System.out.println("4. Calculate on Basic + DA + HA + Bonus");
			System.out.println("5. Calculate on Award Title + Bonus");
			System.out.println("6.Exit");
			System.out.println("Enter Your Choice: ");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1:System.out.println("Enter basic Salary");
			       basic = sc.nextFloat();
				   calculateSalary(basic);
				   break;
			case 2:System.out.println("Enter basic Salary");
				   basic = sc.nextFloat();
				   System.out.println("Enter DA Salary");
				   da = sc.nextFloat();
			       calculateSalary(basic,da);
			       break;
			case 3:
				   System.out.println("Enter basic Salary");
				   basic = sc.nextFloat();
				   System.out.println("Enter DA Salary");
				   da = sc.nextFloat();
				   System.out.println("Enter HA Salary");
				   ha = sc.nextFloat();
			       calculateSalary(basic,da,ha);
			       break;
			case 4:
				   System.out.println("Enter basic Salary");
				   basic = sc.nextFloat();
				   System.out.println("Enter DA Salary");
				   da = sc.nextFloat();
				   System.out.println("Enter HA Salary");
				   ha = sc.nextFloat();
				   System.out.println("Enter Bonus");
				   bonus = sc.nextFloat();
			       calculateSalary(basic,da,ha,bonus);
			       break;
			       
			case 5: 
			       System.out.println("Enter Your Award");
			       AwardTitle = sc.next();
			       System.out.println("Enter Bonus");
			       bonus = sc.nextFloat();
		           calculateSalary(AwardTitle,bonus);
		           break;
			case 6:System.out.println("Exit Successfully");
			       System.exit(0);
			       break;
		    default :System.out.println("Invalid choice");    
			}
		 }while(true);
	}
}
