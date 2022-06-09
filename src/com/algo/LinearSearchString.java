package com.algo;

public class LinearSearchString {
	public static void main(String[] args) {
		String[] name= {"asjad","owais","faisal","deepak","rupesh"};
		String item="faisal";
		int temp=0;
		for(int i=0;i<name.length;i++) {
			if(name[i].equals(item)) {
				System.out.println("Element is found at "+i);
				temp+=1;
			}
				
		}
		if(temp==0) {
			System.out.println("not found");
		}
	}

}
