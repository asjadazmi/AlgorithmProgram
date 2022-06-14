package com.algo;
import java.util.ArrayList;
public class LinearSearchArrayList {
	public static void main(String[] args) {
			ArrayList<String> name=new ArrayList<String>();
			name.add("Asjad");
			name.add("Athar");
			name.add("Azmi");
			String item="Athar";
			int temp=0;
			for(String i:name) {
				if(i==item) {
					System.out.println("item found="+i);
					temp+=1;
					break;
				}
			}
			if(temp==0) {
				System.out.println("item not found");
			
			}
	}


}


