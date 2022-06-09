package com.algo;
import java.util.Arrays;

public class StringAnagram {
	public static boolean isAnagram(String s1,String s2) {
//		removing the white space
		String str1=s1.replaceAll("\\s","");
		String str2=s1.replaceAll("\\s","");
//		comparing the length
		if(str1.length()!=str2.length()) {
			return false;
		}
		else {
//			converting to lowercase 
			char c1[]=str1.toLowerCase().toCharArray();
			char c2[]=str2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			return Arrays.equals(c1, c2);
		}
		
	}
	public static void main(String[] args) {
		System.out.println(isAnagram("listen","silent"));
	}

}
