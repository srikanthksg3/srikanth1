import java.util.ArrayList;
import java.util.List;

public class MergeTwoListsInJava {

	public static void main(String[] args) {
		
		List<String> list1= new ArrayList<String>();
		list1.add("1");
		List<String> list2 = new ArrayList<String>();
		list2.add("2");
		
		List<String> mergeLists = new ArrayList<String>(list1);
		mergeLists.addAll(list2);
		System.out.println(mergeLists);

	}

}
