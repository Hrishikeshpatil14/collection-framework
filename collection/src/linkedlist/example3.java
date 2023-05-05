package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class example3 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("IOT");
		list.add("AI");
		list.add("Machine Learning");
		list.add("cloud computing");
		
		Iterator p=list.listIterator(2);
		
		while(p.hasNext())
		{
			System.out.println(p.next());
		}
	}

}
