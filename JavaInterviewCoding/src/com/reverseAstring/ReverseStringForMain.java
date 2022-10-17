package com.reverseAstring;

public class ReverseStringForMain {

	public static void main(String[] args) {
		
		String blogName= "java2blog";
		String reverse="";
		
		for(int i=blogName.length()-1; i>=0; i--) {
			reverse = reverse + blogName.charAt(i);
		}
		System.out.println(reverse);

	}

}
