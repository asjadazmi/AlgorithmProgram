package com.algo;

public class BinarySearchInt {
	public static void main(String[] args) {
		int[] arr= {2,4,6,7,8,9,12,14,16,18,19,23};
		
		int search=19;
		int li=0;
		int hi=arr.length-1;
		int mi=(li+hi)/2;
		
		while(li<=hi) {
			if(arr[mi]==search) {
				System.out.println("element is found at"+mi);
				break;
			}
			else if(arr[mi]<search) {
				li=mi+1;
			}
			else {
				hi=mi-1;
			}
			mi=(li+hi)/2;
		}
	if(li>hi) {
		
		System.out.println("not found");
	}
	}
}
