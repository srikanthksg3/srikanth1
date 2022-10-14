
public class SwapToNumbers {

	public static void swapTwoNumbers(int a, int b) {
		b= b+a;
		 a= b-a;
		 b= b-a;
	}

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		swapTwoNumbers(a, b);
		System.out.println(a+ " "+b);
		

	}

}
