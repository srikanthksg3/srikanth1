package com.lengthOfString;

public class LenghtOfStringMain {

	public static void main(String[] args) {
		
		String helloWorld= "This is hello world";
		System.out.println(getLengthOfStringWithCharArray(helloWorld));

	}
	public static int getLengthOfStringWithCharArray(String str) {
		int length= 0;
		char[] strCharArray= str.toCharArray();
		for(char c: strCharArray) {
			length++;
		}
		return length;
	}

}
