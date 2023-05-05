package comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Employee1 {

	public static void main(String[] args) {
		ArrayList<Employee>list=new ArrayList<>();
		list.add(new Employee(101, "abc", 45500));
		list.add(new Employee(105, "erbc", 55500));
		list.add(new Employee(108, "bhki", 65500));
		list.add(new Employee(104, "xyz", 39500));
		
		System.out.println("Before Sorting");
		Iterator<Employee>it1=list.iterator();
		
		while(it1.hasNext()) {
			Employee temp=it1.next();
			System.out.println(temp);
		}
		Collections.sort(list);
		System.out.println("After sorting");
	      it1=list.iterator();
	      while(it1.hasNext()) {
	    	  System.out.println(it1.next());
	      }
	    
		
	}

}
