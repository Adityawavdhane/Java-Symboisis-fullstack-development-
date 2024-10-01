/* Program for accepting city name and state */

package io;
import java.util.*;

public class City {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		String city[][] = new  String[2][2];
		Scanner sc = new Scanner(System.in);
		
	    for(int i=0;i<2;i++)
	    {
	    	for(int j=0;j<2;j++)
	    	{
	    		if(j==0)
	    		{
	    			System.out.println("Enter State name");
	    			city[i][j] = sc.next();
	    		}
	    		else
	    		{
	    			System.out.println("Enter City name");
	    			city[i][j] = sc.next();
	    		}
	    	}
	    }
	    
	    for(int i=0;i<2;i++)
	    {
	    	for(int j=0;j<2;j++)
	    	{
	    		System.out.print(city[i][j]+"\t");
	    	}
	    	System.out.println();
	    }
	        
	}
}
