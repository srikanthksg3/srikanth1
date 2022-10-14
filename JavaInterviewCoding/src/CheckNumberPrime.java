
public class CheckNumberPrime {
	
	public static boolean isPrime(int n) {
		boolean b = false;
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				b= false;
			}else
				b= true;
		}
		return b;
	}

	public static void main(String[] args) {
		
		System.out.println(isPrime(19));
	}

}
