
public class CheckString {
	
	public static boolean checkString(String str) {
		String lowerCase =str.toLowerCase();
		char[] c= lowerCase.toCharArray();
		boolean b = false;
		for(int i=0; i<str.length(); i++) {
			if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u') {
				b = true;
				break;
			}else {
				b= false;
			}
		}
		return b;
	}

	public static void main(String[] args) {

		System.out.println(checkString("sk"));

	}

}
