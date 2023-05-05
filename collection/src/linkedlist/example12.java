package linkedlist;

import java.util.LinkedList;

public class example12 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("IOT");
		list.add("AI");
		list.add("Machine Learning");
		list.add("cloud computing");
		System.out.println(list);
		
		System.out.println(list.remove(1));
		
		System.out.println(list);
		
	}

}
