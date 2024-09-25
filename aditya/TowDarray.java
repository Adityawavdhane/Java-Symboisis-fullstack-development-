package aditya;
import java.util.*;
import java.util.Scanner.*;

public class TowDarray {
	 public static void method() {
		 Scanner sc=new Scanner(System.in);
		  int[][]TwoDarray=new int[2][2];
		  int[][]t1= {
				  {1,2,3},
				  {1,2,3},
				  {1,2,3},
		  };
		  for(int i=0;i<2;i++) {
			  for(int j=0;j<2;j++) {
				  System.out.print("Enter the value");
				  TwoDarray[i][j]=sc.nextInt();
			  }
		  }
		  for(int i=0;i<2;i++) {
			  for(int j=0;j<2;j++) {
				  System.out.print(TwoDarray[i][j]+"\t");
			  }
		  }

	 }
}
