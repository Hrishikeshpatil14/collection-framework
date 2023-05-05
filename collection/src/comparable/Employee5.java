package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Employee5 {

	public static void main(String[] args) {
		ArrayList<Employee4>list1=new ArrayList<>();
		list1.add(new Employee4(101, "abc", 45500));
		list1.add(new Employee4(105, "erbc", 55500));
		list1.add(new Employee4(108, "bhki", 65500));
		list1.add(new Employee4(104, "xyz", 39500));
		
		System.out.println("Before Sorting");
		Iterator<Employee4>it2=list1.iterator();
		
		while(it2.hasNext()) {
			Employee4 temp=it2.next();
			System.out.println(temp);
		}
		Collections.sort(list1);
		System.out.println("After sorting");
	      it2=list1.iterator();
	      
	      while(it2.hasNext()) {
	    	  System.out.println(it2.next());

	}

}
}

