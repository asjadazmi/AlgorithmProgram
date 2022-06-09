package com.algo;

public class LinearSearchInt {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,34,54,2,4};
		int item=98;
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==item) {
				System.out.println("element at index is"+i);
				temp+=1;
			    
			}
		}
			if(temp==0) {
				System.out.println("not found");
			}
			
		}
	}


