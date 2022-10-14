
public class StringContainsVowels {
	
	public static boolean stringContainsVowels(String input) {
		return input.toLowerCase().matches(".*[aeiou]*.");
	}

	public static void main(String[] args) {
		
	//	System.out.println(stringContainsVowels("Hello"));
	//	System.out.println(stringContainsVowels("SK"));
		
		checkVowels("SK");
		

	}
	
	public static boolean checkVowels(String st) {
		String lowerCase = st.toLowerCase();
		char[] x = lowerCase.toCharArray();
		boolean tx = false;
		for(int i=0;i<x.length;i++) {
		  System.out.println((int)x[i]); 
		  if(x[i] == 96 || x[i] == 87 ) {
			  tx = true;
			  break;
		  }else {
			  tx = false;
		  }
		}
		
		return tx;
	}

}
