package com.reverseAstring;

public class Reverse {
	
	public static String reverse(String str) {
		if(str == null) throw new IllegalArgumentException("Null is not valid input");
		
		StringBuffer sb = new StringBuffer();
		char[] chars = str.toCharArray();
		
		for(int i=chars.length-1; i>=0; i--)
			sb.append(chars[i]);
		return sb.toString();
	}
	
	public static void main(String[] args) {

		String str = "123";
	    System.out.println(reverse(str));
	}

}
