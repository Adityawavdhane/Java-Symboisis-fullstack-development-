/* Program to find character is vowel or consonent */

package io;
import java.util.*;

public class Vowels {
    public static void main(String[] args)
    {
    	char alpha;
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter any Character: ");
    	alpha =sc.nextLine().charAt(0);
    	
    	if(alpha == 'a')
    	{
    		System.out.println("This character is Vowel "+alpha);
    	}
    	else
    	{	
    		if(alpha == 'e')
    		{
    			System.out.println("This is Vowel "+alpha);
    		}
    	else
    	{
    		if(alpha == 'i')
    		{
        		System.out.println("This is Vowel "+alpha);
        	}
    	else
    	{	
    	   if(alpha == 'o')
    	   {
       		   System.out.println("This is Vowel "+alpha);
       	    } 
    	else
    	{	
    		if(alpha == 'u')
    		{
        		System.out.println("This is Vowel "+alpha);
        	}
    	else
    	{	
    		System.out.println("It is Consonent");
        }
      }
    }
   }
  }
    	
    	
       switch(alpha)
       {
       		case 'a':System.out.println("Is Vowel");
       		        break;
       		case 'e':System.out.println("Is Vowel");
       				break;
       		case 'i':System.out.println("Is Vowel");
       		 		break;
       		case 'o':System.out.println("Is Vowel");
       				break;
       		case 'u':System.out.println("Is Vowel");
       		        break;
       		default:System.out.println("Is Consonent");
       }
    }
}