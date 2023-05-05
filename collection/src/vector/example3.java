package vector;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class example3 {

	public static void main(String[] args) {
		
		ArrayList<Integer>list= new ArrayList<>();
		
		list.add(34);
		list.add(56);
		list.add(89);
		list.add(45);
		list.add(34);
		
		System.out.println(list);
		
		ListIterator itr=list.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		
	    }
		
		while(itr.hasPrevious())
		{
			System.out.println("Revarse Order \n"+itr.previous());
		}
		list.add(87);
		while(itr.hasNext())
		{
			System.out.println(" final list \n"+itr.next());
		}
        
}
}