import java.util.Arrays;

public class SecondLargestNoInArray {

	public static void main(String[] args) {
		
//		int[] arr = {1,3,6,8,2,9};
//		int n =arr.length;
//		
//		Arrays.sort(arr);
//		System.out.println(arr[n-2]);
		
		int[] arr= {17,57,92,67,35,86,25};
		int temp;
		int size;
		
		size= arr.length;
		
		for(int i=0; i<size; i++) {
			for(int j=i+1; j<size; j++) {
				if(arr[i]> arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
				}
			}
		}
		System.out.println(arr[size-2]);
		
	}

}
