package linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class example15 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("IOT");
		list.add("AI");
		list.add("Machine Learning");
		list.add("cloud computing");
		System.out.println(list);
		
		Collections.swap(list, 0, 3);
		System.out.println(list);
	}

}
