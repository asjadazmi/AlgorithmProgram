package com.algo;

public class InsertionString extends CommonDisplay{
	public static void main(String[] args) {
		String arr[]= {"asjad","athar","owais","khalid"};
		String temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j].compareTo(arr[j+1])>0) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		display1(arr);
	

}
}