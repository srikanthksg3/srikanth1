package com.uniqueCharactersInString;

public class indexOfandlastIndexOf {

	public static void main(String[] args) {
		
		System.out.println(hasAllUniqueChars("java2blog"));
	}
		
		public static boolean hasAllUniqueChars(String word) {
			for(int index=0; index< word.length(); index++) {
				char c = word.charAt(index);
				if(word.indexOf(c)!=word.lastIndexOf(c))
		              return false;
			}
			return true;
			
	}

}
