package com.algo;

public class InsertionSortingInteger extends CommonDisplay {
	public static void main(String[] args) {
		int arr[]= {7,4,8,3,2,5};
		
		for(int i=1;i<arr.length;i++) {
			int current=arr[i];
			int j=i-1;
			while(j>=0&& current <arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
		}
		display(arr);

}

	
}
