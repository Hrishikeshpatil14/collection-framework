package linkedlist;

import java.util.LinkedList;

public class example6 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("IOT");
		list.add("AI");
		list.add("Machine Learning");
		list.add("cloud computing");
		
		System.out.println(list);
		
		list.addFirst("Java");
		list.addLast(".net");
		System.out.println(list);
	}

}
