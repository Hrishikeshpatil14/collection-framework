package linkedlist;

import java.util.LinkedList;

public class example5 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("IOT");
		list.add("AI");
		list.add("Machine Learning");
		list.add("cloud computing");
		
		System.out.println(list);
		
		list.add(2, "Java");
		System.out.println(list);
	}

}
