import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class onlyOddNumbersCheck {
	
	public static void main(String[] args) {
	
	int[] a = {1,3,5,7,11};
	List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,3,5,7,11));
	System.out.println(onlyOddNumbers(list));
	}
	
	public static boolean onlyOddNumbers(List<Integer> list) {
		boolean b= false;
		for(int i: list) {
			if(i%2!=0) {
				b= true;
			}else {
				b= false;
			}
		}
		return b;
	}

}
