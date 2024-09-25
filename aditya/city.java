package aditya;
import java.util.*;

public class city {
	public static void main(String[]args) {
		System.out.println("TEst");
		String city1[][] = new String[5][5];
		Scanner sc=new Scanner(System.in);
		//	city1[0][0]= "TestCity";
			//System.out.println(city1[0][0]);
		  for(int i=0;i<5;i++)
		  {
			  for(int j=0;j<5;j++)
			  {
				  System.out.println("Enter the city name: ");
				  city1[i][j]=sc.nextLine();
			  }
		  }
	}

}
