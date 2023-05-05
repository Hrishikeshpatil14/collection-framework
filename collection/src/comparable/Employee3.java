package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Employee3 {

	public static void main(String[] args) {
		ArrayList<Employee2>list1=new ArrayList<>();
		list1.add(new Employee2(101, "abc", 45500));
		list1.add(new Employee2(105, "erbc", 55500));
		list1.add(new Employee2(108, "bhki", 65500));
		list1.add(new Employee2(104, "xyz", 39500));
		
		System.out.println("Before Sorting");
		Iterator<Employee2>it2=list1.iterator();
		
		while(it2.hasNext()) {
			Employee2 temp=it2.next();
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
