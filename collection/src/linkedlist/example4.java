package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class example4 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("IOT");
		list.add("AI");
		list.add("Machine Learning");
		list.add("cloud computing");
		
		
		Iterator<String> iterator=list.descendingIterator();
		while(iterator.hasNext())
		{
		    System.out.println(iterator.next());
		}
		
	}

}
