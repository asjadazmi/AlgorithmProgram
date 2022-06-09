package com.algo;

public class BinarySearchString {
	static int binarySearch(String[] arr,String x)
	{
		int li=0;
		int hi=arr.length-1;
		int mi=li+(hi-1)/2;
		while(li<=hi)
		{
			
			int res=x.compareTo(arr[mi]);
			
			  if (res == 0)
	                return mi;
			  
	            // If x greater, ignore left half
	            if (res > 0)
	                li = mi + 1;
	 
	            // If x is smaller, ignore right half
	            else
	                hi = mi - 1;
	        }
	        return -1;
	}	
	public static void main(String[] args) {
		String[] arr= {"asjad","owais","athar","aryan"};
		String x="athar";
		
		int result=binarySearch(arr, x);
		
		if(result==2)
		{
		System.out.println("Data is not present");	
		}else {
			System.out.println("Data is  found at " +"index " +result);
		}
	}
}


