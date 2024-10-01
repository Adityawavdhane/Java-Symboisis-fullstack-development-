package io;


public class Index {
	
	public static void main(String[] args) {
	
	int arr[] = new int[] {1,2,3,4,5,6,7,8,9};
	int target = 10;
	int i,index1=0,index2=0;
	
	for( i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{ 
			if(arr[i]+arr[j]==target)
			{
				index1 = i;
				index2 = j;
			}
		}
	}
	
	System.out.println("Targeted value is index1 "+index1);
	System.out.println("Targeted value is index2 "+index2);
	
  }
}
